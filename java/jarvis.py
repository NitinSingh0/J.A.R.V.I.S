import pyttsx3
import datetime
import speech_recognition as sr
import os
import webbrowser
import wikipedia 
from googlesearch import search
import subprocess as sp
import pywhatkit as kit

paths = {
    
    'notepad': "C:\Windows\WinSxS\amd64_microsoft-windows-notepad_31bf3856ad364e35_10.0.22621.2215_none_4f1679e8eb85ef57\notepad.exe",
    'calculator': "C:\\Windows\\System32\\calc.exe"
}
USERNAME="Nitin"

engine=pyttsx3.init('sapi5')
voices = engine.getProperty("voices")
#print(voices)
engine.setProperty('voice', voices[0].id)

def speak(audio):
    engine.say(audio)
    engine.runAndWait()

def takeCommand():
    r = sr.Recognizer() 
    with sr.Microphone() as source:
        print("Listening...")
        r.pause_threshold=1
        audio=r.listen(source)
        try:
            print("Recognizing...")
            query=r.recognize_google(audio, language='en-in')
            print(f"User said:{query}\n")
        except Exception as e:
            print("Say that again please")
            
            return "none"
    return query
def wishme():
    hour = int(datetime.datetime.now().hour)
    if hour>=6 and hour<12:
        speak(f"Good Morning {USERNAME}")
    
    elif hour>=12 and hour<18:
        speak(f"Good Afternoon {USERNAME}")
        
    else:
        speak(f"Good Evening {USERNAME}")
    speak("I am JARVIS, your personal assistant. How may I assist you?")

def whats(number):
                    speak (number[::])
                    speak("What is the message sir?")
                    message=takeCommand()
                    print(message,number)
                    kit.sendwhatmsg_instantly(f"+91{number}",message)
                    speak("message sent sucessfully..")
def check():
                    speak("on what number should i send the message sir ?")
                    number=(input("enter number  "))
                    if len(number)==10 :
                        whats(number)
                    else:
                        speak("incorrect number..")
                        speak("enter it again..")
                        check()
    
if __name__=="__main__":
    status=True
    wishme()
    while(status):
        query=takeCommand().lower()
        if 'jarvis' in query:
            query=query.replace("jarvis","")
            if 'wikipedia' in query:
                speak("Searching Wikipedia....")
                query=query.replace("wikipedia","")
                result=wikipedia.summary(query,sentence=2)
                speak("According to wikipedia")
                print(result)
                speak(result)
            elif 'open google' in query:
                speak("Opening google....")
                webbrowser.open("google.com")
        
            elif 'open youtube' in query:
                speak("Opening youtube....")
                webbrowser.open("youtube.com")
            elif 'open stack overflow' in query:
                speak("Opening stack overflow....")
                webbrowser.open("stackoverflow.com")
            elif 'the time' in query:
                strTime=datetime.datetime.now().strtime("%H:%M:%S")
                speak(f"sir the time is {strTime}")
            elif 'shutdown my device' in query:
                speak("shutting down your device...")
                sp.call(['shutdown', '/l'])
            elif "google search" in query:
                query=query.replace("google search","")
                kit.search(query)
            elif 'notepad' in query:
                os.startfile(paths['notepad'])
            elif 'open cmd' in query:
                os.system('start cmd')
            elif 'open calculator' in query:
                sp.Popen(paths['calculator'])
            elif 'play on youtube' in query:
                query=query.replace("play on youtube","")
                kit.playonyt(query)
            elif 'open camera' in query:
                sp.run('start microsoft.windows.camera:', shell=True)
            elif 'turn off' in query:
                speak("turning off")
                status=False
            elif "who am i" in query:
                speak(f"your name is {USERNAME}")
            elif "who are you" in query:
                speak("I am J.A.R.V.I.S your personal assistant")
            elif "reset username" in query:
                speak("what's your new username")
                query=takeCommand().lower()
                USERNAME=query
                speak("username resetted sucessfully")
                speak(f"now your new username is {USERNAME}")
            elif "send whatsapp message" in query:
                check()
            
            else:
                speak("'Sorry, I could not understand. Could you please say that again?")