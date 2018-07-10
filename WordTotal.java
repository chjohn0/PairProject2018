package count;

public class WordTotal {
	String text;
	int charCount; // �ַ�ͳ��
	int blankCount; // �ո�ͳ��
	int tabCount; // ˮƽ�ַ�Count
	int enterCount; // ���з�Count
	int total; // �����ַ�ͳ��
	int noCount; // ����ĸ����ͳ��
	int lineCount; // ����ͳ��
	int wordCount; // ����ͳ��
	int lineValidate; // ��Ч����
	
	String[] word = new String[255];
	int[] wordRep = new int[255];	


	public int[] getWordRep() {              //���ʰ��ֵ�����
		for(int i=0; i<word.length-1; i++){
			if(word[i].equals(null)) break;
			for(int j=i+1; i<word.length; j++){
				if(word[j].equals(null)) break;
				if(word[i].equals(word[j]))
					wordRep[i]++;
				    for(int k=j; k<word.length; k++){
				    	if(word[j].equals(null)) break;
				    	if(k==word.length) continue;
				    	word[k] = word[k+1];
				    }
			}
		}
		return wordRep;
	}

	public void setWordRep(int[] wordRep) {
		this.wordRep = wordRep;
	}

	public int getLineValidate() {            //��Ч����ͳ��
		String[] line = text.split("\n");
		char c='\0';
        boolean flag = true;	
		for(int i=0; i<line.length; i++){
			for(int j=0; j<line[i].length(); j++){
			  c = line[i].charAt(j);
			  if(c ==' '){
				  flag = false;
			  }else{
				  flag = true;
				  break;
			  }
			}
			if(flag) lineValidate++;
			flag = true;
		}
		return lineValidate;
	}

	public void setLineValidate(int lineValidate) {
		this.lineValidate = lineValidate;
	}


	public WordTotal(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getCharCount() {
		return charCount;
	}

	public void setCharCount(int charCount) {
		this.charCount = charCount;
	}

	public int getTabCount() {
		return tabCount;
	}

	public void setTabCount(int tabCount) {
		this.tabCount = tabCount;
	}

	public int getEnterCount() {
		return enterCount;
	}

	public void setEnterCount(int enterCount) {
		this.enterCount = enterCount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getBlankCount() {
		return blankCount;
	}

	public void setBlankCount(int blankCount) {
		this.blankCount = blankCount;
	}

	public int getNoCount() {
		return noCount;
	}

	public void setNoCount(int noCount) {
		this.noCount = noCount;
	}

	public int getLineCount() {
		return lineCount;
	}

	public void setLineCount(int lineCount) {
		this.lineCount = lineCount;
	}

	public void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}

	public void getCharacterCount() {           //�ַ����ո��Ʊ�����ͳ��
		char c = '\0';
		for (int i = 0; i < text.length(); i++) {
			c = text.charAt(i);
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
				charCount++;
			} else if (c == ' ') {
				blankCount++;
			} else if (c == '\r') {
				tabCount++;
			} else if (c == '\n') {
				enterCount++;
				lineCount++;
			}
			
		}
		total = charCount + blankCount + tabCount + enterCount;
	}

	public int getWordCount() {         //����ͳ��
		char c = '\0';
		int j = 0;
		word[0] = "";
		boolean flag = false;
		for (int i = 0; i < text.length(); i++) {
			c = text.charAt(i);
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
				word[j] = word[j] + c;
				flag = true;
			} else if (flag == true) {
				j++;
				flag = false;
			}
		}
		return j;
	}
	
	public void orderWord(){                //����Ƶ��
		String temp;
		for(int i=0; i<word.length-1; i++){
			for(int j=i; j<word.length; j++){
				if(word[i].compareTo(word[j])>0){
					temp = word[i];
					word[i] = word[j];
					word[j] = temp;
				}
			}			
		}
	}
}
