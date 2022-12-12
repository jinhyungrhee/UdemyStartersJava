package com.in28minutes.oops.level2.interfaces;

public interface GamingConsole {
	// 이러한 적용법들은 이 게이밍 콘솔을 적용하는 게임들에 의해 제공됨
	public void up();
	public void down();
	public void left();
	public void right();
	// 신경써야 할 것은 '이것들을 어떻게 호출하냐'임
	// 여기서 우리는 선언을 제공하는 것이지, 정의를 내리는 게 아님!
}
