package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.mygdx.game.Assets.Assets;
import com.mygdx.game.Load.LoadScreen;
import com.mygdx.game.ParentClasses.ScreenAndStage.MyScreen;

import java.lang.reflect.InvocationTargetException;
import java.util.Stack;

public class MyGdxGame extends Game {

	private final Stack<Class> backButtonStack = new Stack();

	public void setScreenBackByStackPop(){
		if (backButtonStack.size()>1){
			try {
				setScreen((MyScreen) backButtonStack.pop().getConstructor(MyGdxGame.class).newInstance(this),false);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		else
		{
			Gdx.app.exit();
		}
	}

	private void setScreen(Screen screen, boolean pushToStack) {
		Screen prevScreen = getScreen();
		if (prevScreen!=null) {
			if (pushToStack) {backButtonStack.push(prevScreen.getClass());}
			try {
				prevScreen.dispose();
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
		super.setScreen(screen);
	}


	@Override
	public void create() {
		Assets.create();
		setScreen(new LoadScreen(this));
	}

	@Override
	public void setScreen(Screen screen) {
		setScreen(screen,true);
	}
}
