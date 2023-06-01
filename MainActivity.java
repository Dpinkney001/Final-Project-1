package com.example.finalproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.io.File;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements StackInterface {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

    }

    public void createTextFile(View view){
        Scanner inputStream = null;
        PrintWriter outputStream = null;//

        try {
            inputStream = new Scanner(new File(fileName + ".txt"));
            inputStream.nextLine();
            while (inputStream.hasNextLine()) {
                String data = inputStream.nextLine();
    }

    /////////////////////////////////////////////////////////////////
    //--------------------stack operations--------------------------
    //  createStack()
    // creates an empty stack
    //----------------------------------------------------------
    // isEmpty():boolean{query}
    // checks if stack is empty
    //-------------------------------------------------------------
    public boolean isEmpty(){

    };
    //------------------------------------------------------------
    //         push(in newItem:stackItemType) throws stackexception
    //  adds new item to the top of the stack. throws exception if the
    //  insertion is not successful
    //----------------------------------------------------------------------------


    //----------------------------------------------------------------------------
    // pop():StackItemType throws StackException
    //  retrieves and then removes the top of the stack( the item that was most receintly added)
    //  throws the stackexceptions
    // if the deletion is not successfull
    //-----------------------------------------------------------------------------------------
    @Override
    public Object pop() throws StackException{}

    @Override
    public Object peek() throws StackException {
        return null;
    }

    //-------------------------------------------------------------------------------------------
    // popAll()
    // removes all items from the stack
    //-------------------------------------------------------------------------------------------
    @Override
    public void popAll(){

    }

    @Override
    public void push(Object newItem) throws StackException {

    }

    //---------------------------------------------------------------------------------------------
    // peek():stackItemType {query} throws stackexception
    //
    public class tasksOrderStack implements  StackInterface{
        final int MAX_STACK_SIZE = 25;
        private Objects items[];
        private string textFileName;
        private int top;
        private int priority;

        enum priority = {high, medium, low };// 0, 1 , 2

        public tasksOrderStack(){
            items = (Objects[]) new Object[MAX_STACK_SIZE];
            top = -1;
        }

        public void task(){
        textFileName = null;
        priority = null;
        }

        public void setTasks(Object task()){
            textFileName = setText(textFileName)
        }
    }


        @Override
        public boolean isEmpty() {
            return top < 0;
        }

        @Override
        public void popAll() {
            items = (Objects[]) new Object[MAX_STACK_SIZE];
            top = -1;

        }

        @Override
        public void push(Object newItem) throws StackException {
            if(!isFull()){
                items[++top] = (Objects) newItem;
            }else{
                throw new StackException("StackException on push: stack full");
            }// end else

        }// end push

        @Override
        public Object pop() throws StackException {
            if(!isEmpty()){
                return items[top--];
            }else{
                throw new StackException("StackException on pop: stack empty");
            }// end else
        }// end pop

        @Override
        public Object peek() throws StackException {
            if (!isEmpty()){
                return items[top];
            }else{
                throw new StackException(" STack Exception on peek: - stack empty");
            }// end else
        }// end peek

        @Override
        public boolean isFull() {
            return top == MAX_STACK_SIZE-1;
        }
    }
}

    public void writeToFile(View view) {

    }

    public void saveToFile(View view) {
    }

    public void lowPriorityTask(View view) {


    }

    public void mediumPriorityTask(View view) {
    }

    public void highPriorityTask(View view) {
    }

        public setPriorityLevel(enum priority){

        }

    public void saveToFile(View view) {
    }
}