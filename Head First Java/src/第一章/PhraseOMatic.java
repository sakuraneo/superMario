package µÚÒ»ÕÂ;

public class PhraseOMatic {
	public static void main(String[] args) {
		String[] wordListOne = {"24/7","muti-Tier","30000","B-to-B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
		
		String[] wordListTwo = {"empowered","sticky","value-added","oriented","centric","ditributed","clustered","branded","outside-the-box","positioned","networked",
				"focused","leveraged","aligned","targted","shared","cooperative","accelerated"};
		
		String[] wordListTree = {"process","tipping-point","solution","architeture","core competency","strategy","mindshare","portal","space","vision","paradigm","misson"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListTree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase =wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListTree[rand3];
		
		System.out.println("What we need is a " + phrase );
	}
}
