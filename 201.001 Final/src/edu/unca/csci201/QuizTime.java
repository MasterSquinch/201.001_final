package edu.unca.csci201;

import java.util.Random;

import edu.unca.csci201.Questions.*;

public class QuizTime {
	public static Random rand = new Random();
	public static MultipleChoiceQuestion[] mcQuestions = {
			new MultipleChoiceQuestion("Surrealism was born out of which previous anti-war, anti-art movement, which flourished in the years after the first world war?", "Dodo","#Dada","Dandy"),
			new MultipleChoiceQuestion("The first incarnation of the Surrealist Manifesto, published in 1924, described the movement as what?", "#Pure psychic automatism","Impure psychotic automatism","Pure stuff and nonsense","Pure fluff and bewilderment"),
			new MultipleChoiceQuestion("Kierkegaard, which of the following is a viable solution to the absurd?", "#a leap of faith","physical suicide","philosophical suicide","acceptance"),
			new MultipleChoiceQuestion("Camus, which of the following is a viable solution to the absurd?", "a leap of faith","physical suicide","philosophical suicide","#acceptance"),
			new MultipleChoiceQuestion("Which of the following is of no consequence to the universe?", "revolt","#wisdom","freedom","passion"),
			new MultipleChoiceQuestion("Who designed the dream sequence in Hitchcock's Spellbound", "Joan Miró","Andre Brenton","Luis Buñuel","#Salvador Dalí"),
			new MultipleChoiceQuestion("Charlie, battered and tortured, is recognized as a ", "cat","dog","man","woman"),
			new MultipleChoiceQuestion("Is it better to use/posess someone else's body or to create your own new body?", "use","create"),
			new MultipleChoiceQuestion("What is the title of this painting?", "#Woman and Bird in the Moonlight","In the Dark of the Night two Squiggles are Smiling ","Son of Man","This is Not a Woman, Sighed the Moon"),
			new MultipleChoiceQuestion("Question", "answer.","#answer?","answer!","*answers*"),
			new MultipleChoiceQuestion("Which of the following is NOT a notable member of the Church of the SubGenius?", "Robert Crumb","Mojo Nixon","#Pee-wee Herman","The members of Negativland"),
			new MultipleChoiceQuestion("Which of these artists was NOT directly involved in the surrealist movement?", "Frida Khalo","Joan Miró","René Magritte","#Pablo Picasso "),
			new MultipleChoiceQuestion("The London International Surrealist exhibition of 1936 was attended by Salvador Dalí wearing which eyebrow-raising costume?", "A tutu","BDSM gear","#A diving suit","A bear suit"),
			new MultipleChoiceQuestion("The first edition of the Principia Discordia was printed using what?", "Woodblock on cloth, China circa 220 A.D.","Ceramic movable-type","#Jim Garrison's Xerox printer"),
			new MultipleChoiceQuestion("?", "","# ", "", ""),
			new MultipleChoiceQuestion("Writer and philosopher Georges Bataille, who fell out with the surrealists early on, once wrote an essay entitled what?", "#The Solar Anus","The Solar Plexus","The Solar System","The Solar Ballet"),
			new MultipleChoiceQuestion("Is it normal to jump out of a car while the driver is still driving?", "yes","#perfectly","do it","no u"),
			new MultipleChoiceQuestion("The line fomrs on the", "left","right","dot"),
			new MultipleChoiceQuestion("What happens in the most infamous scene from Un Chien Andalou directed by Luis Luis Buñuel? ", "The man's throat is cut","#The man's eyeball is sliced with a razor","The man is shot in the head","The man weeps tears of blood"),
			new MultipleChoiceQuestion("Where should Mayakovsky go?", "Tiananmen Square","a land down under","to the Pampushka","Burning Man"),
			new MultipleChoiceQuestion("I go from house to house every week due to a messy divorce, and I was wondering if a hedgehog or a chincilla would serve me better in this situation?", "hedgehog","chincilla"),
			new MultipleChoiceQuestion("Man Ray's photograph Portemanteau (1920) famously posed a woman as which domestic object?", "A table","#A coat stand","A dishwasher","A tea trolley"),
			new MultipleChoiceQuestion("On a scale of 1-10, how much derailment is acceptable in a campaign?", "1","2","#3","or 8 full Hendersons"),
			new MultipleChoiceQuestion("U want a man for 2 nights. \nPls. \nDon't mind u post this offer pub lically. \nU have no shame. \nThis is such a vulgar offer. \nI think u should marry to satisfy yourself?", "tru","sure","tru tru","abso    luteley"),
			new MultipleChoiceQuestion("Why before if. Again.", "Smashing.")
			
	};
	public static TrueFalseQuestion[] tfQuestions = {
			new TrueFalseQuestion("Morality"),
			new TrueFalseQuestion("#Integrity"),
			new TrueFalseQuestion("Ellison is Visible"),
			new TrueFalseQuestion("Operation Mindfuck reached its conclusion with the publication of 'The Illuminatus! Trilogy' in 1971."),
			new TrueFalseQuestion("#The Suicide Club"),
			new TrueFalseQuestion("#I want to put my brother on the black market. You can help?"),
			new TrueFalseQuestion("#Als Gregor Samsa eines Morgens aus unruhigen Träumen erwachte, fand er sich in seinem Bett zu einem ungeheuren Ungeziefer verwandelt."),
			new TrueFalseQuestion("#The Cacophany Society"),
			new TrueFalseQuestion("#Mihitsu no koi"),
			new TrueFalseQuestion("#Just straight up eat the lettuce"),
			new TrueFalseQuestion("Chuck is a Nihilist"),
			new TrueFalseQuestion("#Are you ever going to live this down?"),
			new TrueFalseQuestion("Kemono tachi wa kokyou wo mezasu"),
			new TrueFalseQuestion("Providing subsidies for easy access anti-biotics for rooftop pigeons will effectively prevent bird disease."),
			new TrueFalseQuestion("#The quality of Slack is of the utmost importance."),
			new TrueFalseQuestion("#This statement is a lie."),
			new TrueFalseQuestion("Papacy is granted through possesion of this card."),
			new TrueFalseQuestion("nɒnˈsɛkwɪtər"),
			new TrueFalseQuestion("Roger Irrelevant successfully convinced his lamp to not commit suicide."),
			new TrueFalseQuestion("#You are a genuine and authorized pope."),
			new TrueFalseQuestion("#The Grand Gidouille on Ubu's belly is a symbol of 'pataphysics."),
			new TrueFalseQuestion("Addition of two numbers"),
			new TrueFalseQuestion("#You lost the game."),
			new TrueFalseQuestion("#Paradox"),
			new TrueFalseQuestion("#It is normal to drink a lot of water after the dog ate all of the sugar.")
			
	};
	public static ShortAnswerQuestion[] saQuestions = {
			new ShortAnswerQuestion("How did Abraham find salvation?", "absurd", 1),
			new ShortAnswerQuestion("Filling the void is what?", "eluding", 1),
			new ShortAnswerQuestion("Rosencrantz and Guildenstein", "dead", 1),
			new ShortAnswerQuestion("Demonstrate that this quiz does not exist.", "What test?", 1),
			new ShortAnswerQuestion("Ek-sen-trik-kuh Discordia:", "The Tales of Shamlicht", 1),
			new ShortAnswerQuestion("If you hated me, and I shrunk to the size of a bug. Would you step on me? What shoes would you wear, and how would you do it?", " ", 3),
			new ShortAnswerQuestion("Hey, do you know where the Nintendo convention is? I got burning man rehearsals at at the Tosh.O amphitheater.", " ", 0),
			new ShortAnswerQuestion("What does this phrase 'I, N., do conjure thee, O Spirit N., by the living God, by the true God, by the holy and all-ruling God, who created from nothingness the heaven, the earth, the sea, and all things that are therein,' translate to in Latin?", "grimoire", 1),
			new ShortAnswerQuestion("If a random dog attacks me in a subway when I was minding my own business, do I have the right to punch the dog owner in the face for the damage? If not, then why are the rights of dog owners more important than mine?", "tyranny", 1),
			new ShortAnswerQuestion("What was the original snub?", "apple", 1),
			new ShortAnswerQuestion("How do you manage the terror of death?", "meaning", 1),
			new ShortAnswerQuestion("Mind", "and Soldier", 1),
			new ShortAnswerQuestion("Why do all of these questions begin with an uppercase letter?", "because", 1),
			new ShortAnswerQuestion("How do I get my real money back?", "don't", 1),
			new ShortAnswerQuestion("What song should one use for their toilet paper tribute?", "what", 1),
			new ShortAnswerQuestion("Why don't you come over here?", "please", 1),
			new ShortAnswerQuestion("What is the only interchangeable automotive part that is a standard equipment on all automobiles today, was invented before the automobile, and named after its inventor?", "schrader", 1),
			new ShortAnswerQuestion("What is the bad language that the last letter is 'e'", " ", 0),
			new ShortAnswerQuestion("Who is one of the most well-known Saints Second Class", "Emperor Norton", 1),
			new ShortAnswerQuestion("Engines O", "Rings and Astronauts", 1),
			new ShortAnswerQuestion("How would you feel if all humans became effeminate sheep?", "wool", 2),
			new ShortAnswerQuestion("How would one go about toasting a bird? Asking for a friend...", "love", 1),
			new ShortAnswerQuestion("Why do people avoid unpleasant situations?", "unpleasant", 1),
			new ShortAnswerQuestion("If God is not bound by time as a byproduct of creating it, does He still experience sequentiality?", "keyphrase", 1),
			new ShortAnswerQuestion("Why does this “front” like to send “messages” to let you know they’re watching, in the form of a question?", "shadow government", 1),
			
	};
	
	public static Question[] se1;
	public static Question[] se2;
	public static Question[] se3;
	
	public static int s1 = 0;
	public static int s2 = 0;
	public static int s3 = 0;
	
	public static void generateSections() {
		for(s1 = 0; s1 <= 15; s1++){
			int b = rand.nextInt(25);
			if (mcQuestions[b].setAdded(false)){
				if (rand.nextInt(4) > 0) {
					se1[s1] = mcQuestions[b];	
				}else{
					return;
				}
			} else {
			 return;
			}
		}
		
		for(s2 = 16 - (15-se1.length); s2 <= 20; s2++){
			int b = rand.nextInt(25);
			if (tfQuestions[b].setAdded(false)){
				if (rand.nextInt(4) > 0 ) {
					se2[s2] = tfQuestions[b];	
				}else{
					return;
				}
			} else {
			 return;
			}
		}
				    
		for(s3 = 21 - (20-se2.length); s3 <= 24; s3++){
			int b = rand.nextInt(25);
			if (saQuestions[b].setAdded(false)){
				if (rand.nextInt(2) > 0) {
					se3[s3] = saQuestions[b];	
				}else{
					return;
				}
			} else {
			 return;
			}
		}
			
	}
				    

public static int getSectionLength(String s){
	int l = 0;
	switch (s) {
		case "se1":
			l = se1.length;
			break;
		case "se2":
			l = se2.length;
			break;
		case "se3":
			l = se3.length;
			break;
	}	
	return l;
}
	
 public static void main(String[] args) {
	 Quiz quiz = new Quiz();
	 
	 generateSections();
	 
	 for (int i = 0; i < se1.length+0; i++){
		 quiz.addQuestion(se1[i]);
	 }
	 for (int i = se1.length; i < (se1.length + se2.length); i++ ){
		 quiz.addQuestion(se2[i]);
	 }
	 for (int i = (se1.length + se2.length); i < ((se1.length + se2.length) + se3.length); i++ ){
		 quiz.addQuestion(se3[i]);
	 }
	 
	 
	 quiz.giveQuiz();
 }
}
