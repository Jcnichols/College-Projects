


# Define custom classes ---------------------------------------------------

#Define a class representing the console window
class Screen

  def cls  #Define a method that clears the display area
    puts ("\n" * 10)  #Scroll the screen 15 times
    puts "\a"  #Make a little noise to get the player's attention
  end
  
  def pause    #Define a method that pauses the display area
    STDIN.gets  #Execute the STDIN class's gets method to pause script
                #execution until the player presses the Enter key
  end
  
end

#Define a class representing the Superman Movie Trivia Quiz
class Quiz
 
  #This method displays the quiz's opening screen
  def display_greeting
  
    Console_Screen.cls  #Clear the display area
  
    #Display welcome message
    print "\t\t  Welcome to the Final Fantasy Quiz!" +
    "\n\n\n\n\n\n\n\n\n\n\n\n\n\nPress Enter to " +
               "continue."
  
  Console_Screen.pause       #Pause the game

  end
 
  #Define a method to be used to present quiz instructions
  def display_instructions
    
    Console_Screen.cls       #Clear the display area
    puts "INSTRUCTIONS:\n\n"  #Display a heading

    #Display the game's instructions
    puts "10 multiple choice questions! can you get them right?" 
    puts "To answer a question type its corresponding letter!"
    puts "for example you want to enter answer A, so press a/A then Enter key."
    puts " Your grade will be presented at the end but 5 or more wrong answers and you fail! \n\n\n"
    puts "Each question is worth one point!\n\n\n\n\n\n\n\n\n"
   
   puts "if your ready hit any key"
	puts ("\n" * 5)
	 
	
	answer = STDIN.gets 
	answer.chop! 
	
	if answer == "i" 
	
	puts "10 out of 10 is a true fan 9 is a fan and 8 is a semi fan 7 is a FF new fan "
	puts "lower than that is failure." 

    Console_Screen.pause       #Pause the game
    end 

  end
 
  #Define a method to be used to present and process quiz questions
  def disp_q(question, q_A, q_B, q_C, q_D, answer)

    #Loop until the player inputs a valid answer
    loop do
  
      Console_Screen.cls       #Clear the display area
    
      #Format the display of the quiz question
      puts question + "\n\n"
      puts q_A
      puts q_B
      puts q_C
      puts q_D
      print "\nType the letter representing your answer: "
    
      reply = STDIN.gets  #Collect the player's answer
      reply.chop!         #Remove the end of line marker
    
      #Analyze the player's input to determine if it is correct
      if answer == reply then
        
        #Keep track of the number of correctly answered questions
        $noRight += 1  
        
      end
      
      #Analyze the answer to determine if it was valid
      if reply == "a" or reply == "b" or reply == "c" or reply == "d" then
    
        break  #Terminate the execution of the loop
    
      end
     
    end

  end

  #Define a method to be used to grade and display quiz results
  def determine_grade
  
    Console_Screen.cls       #Clear the display area  
  
    #To pass the test, the player must correctly answer at least 6 questions
    if $noRight >= 3 then
    
      #Inform the player of the good news and assign a ranking
      print "You correctly answered " + $noRight.to_s + " question(s). "
      puts "You have passed the \nSuperman Movie Trivia Quiz!\n\n"
	  puts "You have earned a rank of: FF new fan " if $noright == 2
      puts "You have earned a rank of: semi fan" if $noRight == 3
      puts "You have earned a rank of: fan" if $noRight == 4
      puts "You have earned a rank of: true fan" if $noRight == 5
      print "\n\nPress Enter to continue."
      
    else  #The player has failed the quiz
    
      #Inform the player of the bad news
      print "You missed " + (6 - $noRight).to_s + " questions. "
      puts "You have failed the Final Fantasy Trivia Quiz."
      puts "Perhaps you should look at https://finalfantasy.fandom.com/wiki/Final_Fantasy_Wiki before returning to"
      puts "retake the quiz."
	  puts "  do you wish to retake the quiz now?   "
	
	   #Execute the Quiz class's display_instructions method
  SQ.display_instructions
  
  #Execute the Quiz class's disp_q method and pass it 
  #arguments representing a question, possible answers and the letter 
  #of the correct answer
  SQ.disp_q("What is the name of the Final Fantasy 1 final boss?",
  "a. Chaos", "b. Ben Miller", "c. Zemus", "d. Vayne", 
  "a")
  
  #Call upon the disp_q method and pass it the second question
  SQ.disp_q("What is the name of Cloud Strife's home town?",
  "a. Zozo", "b. Cornelia", "c. Nibelheim", "d. Pallet town", 
  "c")
  
  #Call upon the disp_q method and pass it the third question
  SQ.disp_q("In which games do the Mime GOGO appear in?",
  "a. FF/FF2", "b. FF5/FF6", "c. FFTA 1&2", "d. FF10/FF10-2", 
  "b")
  
  #Call upon the disp_q method and pass it the fourth question
  SQ.disp_q("What is the name of Final fantasy 4's final boss?",
  "a. SIN", "b. Zeromus", "c. Necron", "d. Chaos", 
  "b")
  
  #Call upon the disp_q method and pass it the fifth question
  SQ.disp_q("Where did Gilgamesh get banished to in FF5?",
  "a. The Moon", "b. Lhusu mines", "c. Earth's Core", "d. The Void", 
  "d")
  
   #Call upon the disp_q method and pass it the sixth question
  SQ.disp_q("What is the name of the the first two super Bosses in a FF game?",
  "a. Bahamut,Leviathan", "b. Ruby Weapon,Emerald Weapon", "c. Zoadark,Yaizmat", "d. Omega,Shinryu", 
  "d")
  
  #Call upon the disp_q method and pass it the seventh question
  SQ.disp_q("What is the name of FF9's Zidane Tribal's home planet?",
  "a. The Moon", "b. Gaia", "c. Terra", "d.earth", 
  "c")
  
  #Call upon the disp_q method and pass it the eighth question
  SQ.disp_q("In which Game did you draw magic from the world and from monsters?",
  "a. FF2", "b. FF 8", "c. FF3", "d. FF9", 
  "b")
  
  #Call upon the disp_q method and pass it the nineth question
  SQ.disp_q("What is the name Rinoa's Dog in FF8?",
  "a. Interceptor", "b. Red XIII", "c. Enkidu", "d. Angelo", 
  "d")
  
  #Call upon the disp_q method and pass it the tenth question
  SQ.disp_q("What item Does Cecil have to use against the final Boss in FF4'?",
  "a. The Excalibur", "b. A Flute", "c. Friendship", "d. CRYSTAL ", 
  "d")
  
  
  #Call upon the Quiz class's determine_grade method to display
  #the player's grade and assigned rank
  SQ.determine_grade
  
  #Call upon the Quiz class's display_credits method to thank
  #the player for taking the quiz and to display game information
  SQ.display_credits
  
   


	  
      
	   
	   
    end
    
	
	
    Console_Screen.pause       #Pause the game
    
  end

  #This method displays the information about the Superman Movie Trivia Quiz
  def display_credits
  
    Console_Screen.cls  #Clear the display area
  
    #Thank the player and display game information
    puts "\t\tThank you for taking the Trivia QUIZ.\n\n\n\n"
   

  end

end


# Main Script Logic -------------------------------------------------------

#Initialize global variable that will be used to keep track of the number
#of correctly answered quiz questions
$noRight = 0

Console_Screen = Screen.new  #Instantiate a new Screen object
SQ = Quiz.new     #Instantiate a new Quiz object

#Execute the Quiz class's display_greeting method
SQ.display_greeting

answer = ""

#Loop until the player enters y or n and do not accept any other input.
loop do

  Console_Screen.cls  #Clear the display area

  #Prompt the player for permission to start the quiz
  print "Are you ready to take the quiz? (y/n): "

  answer = STDIN.gets  #Collect the player's response
  answer.chop!  #Remove one character from the end of the string

  break if answer == "y" || answer == "n"  

end 

#Analyze the player's input
if answer == "n"  #See if the player elected not to take the quiz

 puts "\t\tThank you for taking the Final Fantasy Fan QUIZ.\n\n\n\n"
    puts "\n\t\t\t Developed by John Clayton Nichols.\n\n"
STDIN.gets

else  #The player wants to take the quiz

  #Execute the Quiz class's display_instructions method
  SQ.display_instructions
  
  #Execute the Quiz class's disp_q method and pass it 
  #arguments representing a question, possible answers and the letter 
  #of the correct answer
  SQ.disp_q("What is the name of the Final Fantasy 1 final boss?",
  "a. Chaos", "b. Ben Miller", "c. Zemus", "d. Vayne", 
  "a")
   
  #Call upon the disp_q method and pass it the second question
  SQ.disp_q("What is the name of Cloud Strife's home town?",
  "a. Zozo", "b. Cornelia", "c. Nibelheim", "d. Pallet town", 
  "c")
  
  #Call upon the disp_q method and pass it the third question
  SQ.disp_q("In which games do the Mime GOGO appear in?",
  "a. FF/FF2", "b. FF5/FF6", "c. FFTA 1&2", "d. FF10/FF10-2", 
  "b")
  
  #Call upon the disp_q method and pass it the fourth question
  SQ.disp_q("What is the name of Final fantasy 4's final boss?",
  "a. SIN", "b. Zeromus", "c. Necron", "d. Chaos", 
  "b")
  
  #Call upon the disp_q method and pass it the fifth question
  SQ.disp_q("Where did Gilgamesh get banished to in FF5?",
  "a. The Moon", "b. Lhusu mines", "c. Earth's Core", "d. The Void", 
  "d")
  
   #Call upon the disp_q method and pass it the sixth question
  SQ.disp_q("What is the name of the the first two super Bosses in a FF game?",
  "a. Bahamut,Leviathan", "b. Ruby Weapon,Emerald Weapon", "c. Zoadark,Yaizmat", "d. Omega,Shinryu", 
  "d")
  
  #Call upon the disp_q method and pass it the seventh question
  SQ.disp_q("What is the name of FF9's Zidane Tribal's home planet?",
  "a. The Moon", "b. Gaia", "c. Terra", "d.earth", 
  "c")
  
  #Call upon the disp_q method and pass it the eighth question
  SQ.disp_q("In which Game did you draw magic from the world and from monsters?",
  "a. FF2", "b. FF 8", "c. FF3", "d. FF9", 
  "b")
  
  #Call upon the disp_q method and pass it the nineth question
  SQ.disp_q("What is the name Rinoa's Dog in FF8?",
  "a. Interceptor", "b. Red XIII", "c. Enkidu", "d. Angelo", 
  "d")
  
  #Call upon the disp_q method and pass it the tenth question
  SQ.disp_q("What item Does Cecil have to use against the final Boss in FF4'?",
  "a. The Excalibur", "b. A Flute", "c. Friendship", "d. CRYSTAL ", 
  "d")
  
  
  #Call upon the Quiz class's determine_grade method to display
  #the player's grade and assigned rank
  SQ.determine_grade
  
  #Call upon the Quiz class's display_credits method to thank
  #the player for taking the quiz and to display game information
  SQ.display_credits
  
   


  
end


