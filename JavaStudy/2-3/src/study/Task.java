package study;



// ① TaskクラスにCalculatorクラスを継承させなさい。
	public class Task extends Calculator {
			
    /**
     * タスクの実行
     * 
     */
		
			public void doTask(int number1) {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。	
				
			
				int task1Num = super.plus(number1);
    		 
				System.out.println("plusメソッドの引数が1つの場合:"+ task1Num);
    	 
			}
    
			public void doTask(int number1,int number2) {
    		 
				int task2Num = super.plus(number1,number2);
    	     
				System.out.println("plusメソッドの引数が2つの場合:"+task2Num);
			}
     
    
			public void doTask(int number1,int number2,int number3) {
    		
				int task3Num = super.plus(number1,number2,number3);
    		
				System.out.println("plusメソッドの引数が3つの場合:"+task3Num);
    	   }
	}
