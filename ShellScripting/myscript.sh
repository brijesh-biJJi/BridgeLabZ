#! /usr/bin/bash

# Echo command

  NAME="Baiji"
# echo "my name is $NAME"

#User Input

# read -p "Enter your name:" NAME
# echo "Hello $NAME, where are u man! kya kr rhe ho..! naasta kiy?"

#simple if statement
# if [ "$NAME"=="Brijesh" ]
# then 
# echo "Your name is Brijesh"
# fi

#If-Else
# if [ "$NAME" == "Brad" ]
# then 
#     echo "Your name is Brijesh"
# else 
#     echo "Your name is not Brijesh"
# fi

#Else-if (elif)
if [ "$NAME" == "Brijesh" ]
then 
    echo "Your name is Brijesh"
elif [ "$NAME" == "Brad" ]
then 
    echo "Your name is Brad"
else 
    echo "Your name is not Brijesh or Brad"
fi