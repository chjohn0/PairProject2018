package count;

public class WordTotalTest {
   public static void main(String[] args){
	   String text="Contributor  means any person or \r entity that distributes the Program. \n"
	   		+ "Licensed Patents  mean patent claims licensable by a Contributor which are necessarily  \n"
	   		+ "infringed by the 1 2 56use or sale of its Contribution alone or when combined with the Program.  \n"
	   		+"                                \n"
	   		+ "Program  means the Contributions distributed in accordance with this Agreement. \n"
	   		+ " Recipient means anyone \r who receives the Program under this Agreement, including all Contributors. \n";
	   WordTotal wt = new WordTotal(text);
	   
	   wt.getCharacterCount();        //�ַ����ո��Ʊ�����ͳ��
	   wt.getWordCount();             //����ͳ��
	   wt.getLineValidate();          //��Ч����ͳ��

	   System.out.println("Text is"+text);
	   System.out.println("�ַ���="+wt.charCount);
	   System.out.println("�ո���="+wt.blankCount);
	   
	   System.out.println("ˮƽ�ַ���="+wt.tabCount);
	   System.out.println("���з���="+wt.enterCount);
	   System.out.println("�����ַ���="+wt.total);
	   System.out.println("����="+wt.lineCount);
	   System.out.println("������="+wt.getWordCount());
	   System.out.println("��Ч����="+wt.lineValidate);	   
   }	
}
