package edu.unca.csci201;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// import edu.unca.csci201.Questions.*;

public class Quiz {
	private DecimalFormat numberFormat = new DecimalFormat(".##");
	private ArrayList<Question> qList = new ArrayList<Question>();
	private String[] units = {
			" shakes of a lambs tail",	" schmekles",	" shoggoths in bloom",	" french art-house films",
			" Nickleback albums",	" A ratings on a fast-food chain sanitation score",	" ginger stepchildren",	" nights of sleep",
			"U",	" rack units",	" hands",	" light-years",
			" light nano-seconds",	" light pico-seconds",	"gHz",	"Hz",
			" metric feet",	" blocks",	"LD",
			" brass",	" cow's grass",	" jiffies",	" ticks",
			" Martian seconds.",	" shakes",	" microfortnites",	" dog years",
			" furmans",	" tons of TNT",	"eV",	"kWh",
			" joules",	"N",	" Newtons",	" gallon gasoline equivalent",
			" thermonuclear calories",	" foes",	" strontium units",	" nibbles",
			" FLOPS",	" kiloFLOPS",	" megaFLOPS",	" gigaFLOPS",
			" teraFLOPS",	" bits",	" kilobits",	" megabits",
			" gigabits",	" terabits",	" bytes",	" kilobytes",
			" megabytes",	" gigabytes",	" terabytes",	" BogoMips",
			" K-LOCS",	" G-LOCS",	" micromorts",	" ticks",
			" Centipawns",	" Big Macs",	" Mars Bars",	" parsecs",
			" parcels",	" Mother Cows",	"garns",	" dols",
			" scovilles",	"",	" Eriangs",	" crabs",
			" firkins",	" furlongs/fortnites",	" bloits",	"ngogn",
			" blintz",	"portzebies",	" sagans",	" attoparsecs",	" beard-seconds",
			" mickeys",	" Six Pack Jimmies",	" Smoots",	" Sheffies",
			" Wiffles",	" barns",	" outhouses",	" sheds",
			" knots",	" nautical miles",	" nanoacres",	" barn-megaparsecs",
			" hubblebarns",	" horsepower",	"hp",	"mp",
			" donkeypower",	"dp",	"DPS",	" pirate-ninjas",
			" Friedmen",	" microcenturies",	" tatums",	" New York seconds",
			" New York minutes",	" helens",	" mooches",	" Diracs",
			" MegaFonzies",	" Pouters",	" microPouters",	" Lovelaces", " Warhols",
			" canards", " hair's breaths"
	};
	
	public void addQuestion(Question Q) {
		qList.add(Q);
	}
	
	public double giveQuiz() {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		double finalScore = 0;
		double s1Weight = (double) 45 / (double) QuizTime.getSectionLength("se1");
		double s2Weight = (double) 10 / (double) QuizTime.getSectionLength("se2");
		double s3Weight = (double) 45 / (double) QuizTime.getSectionLength("se3");
		int s2Start = QuizTime.getSectionLength("se1") ;
		int s3Start = QuizTime.getSectionLength("se1") + QuizTime.getSectionLength("se2");
		
		System.out.println("Welcome to the Quiz to End All Quizzes- where your answers nor your score may have no meaning (or not!)\n");
		System.out.println("The quiz consists of \n"+QuizTime.getSectionLength("se1")+" multiple choice questions, \n"+QuizTime.getSectionLength("se2")+" true-or-false question(s), and \n"+QuizTime.getSectionLength("se3")+" short answer questions, \nfor a total of "+qList.size()+" questions.");
		
		for (int i = 0; i < qList.size(); i++) {
			
			if (i == 0) {
				System.out.println("\n\n *** MUTLIPLE CHOICE SECTION *** \n Be sure to type your answer verbatim- answers ARE case sensitive. Do not type A, 1, or any derivative thereof.\n\n");
			} else if (i == s2Start) {
				System.out.println("\n\n *** TRUE OR FALSE SECTION *** \n Tyep in the word true, or false. Case doesn't matter. This is the lowest weighted section, so don't sweat it.\n\n");
			} else if ( i == s3Start) {
				System.out.println("\n\n *** SHORT ANSWER / ESSAY SECTION *** \n This is likely the shortest section, with the longest answers. Don't quote me on that however: the list of questions kind of does what it wants. \nAt any rate, this section is probably the highest weighted, so answer wisely. \n\n Probably. \n\n");
			}

			System.out.println("\n" + (i+1) + " .) " + qList.get(i).getTheQuestionText());
			
			
			if (qList.get(i).isCorrectAnswer(in.nextLine())){
				if (i < QuizTime.getSectionLength("se1")){
					finalScore = finalScore + s1Weight;
				} else
				if (s2Start <= i && i < QuizTime.getSectionLength("se1") + QuizTime.getSectionLength("se2")){
					finalScore = finalScore + s2Weight;
				} else
				if (s3Start <= i && i <= QuizTime.getSectionLength("se1") + QuizTime.getSectionLength("se2") + QuizTime.getSectionLength("se3")  ){
					finalScore = finalScore + s3Weight;
				}
			} else {
			}
		}
				System.out.println("\n\n\n\n****RESULTS*****\nThe correct answers for the answers which you have answered incorrectly as well as the correct answers you have correctly provided are:\n");
			for (int i = 0; i < qList.size(); i++){
				System.out.println(i + ".) " + qList.get(i).getCorrectAnswer());
			}
				
			System.out.print("Your final score is " + finalScore);
			if (0 < rand.nextInt(units.length))
				System.out.print(" / " + (rand.nextInt(80)+20 + numberFormat.format(rand.nextDouble())) + units[rand.nextInt(units.length - 1)]);
			
				
		in.close();
		return finalScore;
		
		}
}

