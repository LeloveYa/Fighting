package thread;


	class tortoise implements Runnable{
		int i;
		public void run(){
			for(int i=1;i<=10;i++){
				System.out.println("乌龟跑到了"+i+"米处");
			}
		}
	}
	class rabbit implements Runnable{
		int i;
		public void run(){
			for(int i=1;i<=10;i++){
				System.out.println("兔子跑到了"+i+"米处");
			}
		}
	}
	public class Rabbit_tortoise{
	public static void main(String[]args){
		tortoise r1=new tortoise();
		rabbit r2=new rabbit();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}
}