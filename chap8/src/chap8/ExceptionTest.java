package chap8;

public class ExceptionTest {

	public static void main(String[] args) {
		// 2개 이상의 명령행 매개변수 입력, 정수 변경 가능한 값, j != 0
		// 100 100 - 예외발생X - 완료
		// 100 - ArrayIndexOutOfBoundsException - 중단
		// 100 0 - ArithmeticException - 중단
		// 백 백 - NumberFormatException - 중단
		int k = 0;
		
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			k = i / j; 
			// 자동 new  ArithmeticException();
			// try 중단
			// catch 블록 이동 - 첫번째 catch 문으로 이동
		} catch (ArithmeticException e) { // 자식 예외처리 우선
			System.out.println("0을 입력하실 수 없습니다.");
		}
		/*
		catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("2개 입력되지 않았거나 숫자값이 아닙니다.");
		} catch(Exception e) { // 타입 형변환 (자식 -> 부모) - *다형성* // 부모 예외처리 나중
			System.out.println("예외 종류에 상관없이 모두 동일하게 예외 처리");
		} 
		*/
		finally {
			System.out.println("항상 출력됩니다.");
		}
		
		/*
		catch (ArithmeticException e) {
			System.out.println("0을 입력하실 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2개 이상의 값을 입력하셔야 합니다.");
			//e.printStackTrace(); // 오류 발생 원인 출력 - 자세한 내용
			//System.out.println(e.getMessage()); // 오류 발생 원인 출력 - 메시지 1개
		} catch (NumberFormatException e) {
			System.out.println("정수로 변경 가능한 값을 입력하셔야 합니다.");
		}
		*/
		
		System.out.println("나누기 결과 = " + k);
		System.out.println("main 종료");

	}

}
