package model;

import java.util.Scanner;

// A model for the game of 20 questions. This type can be used to build a 
// console based game of 20 questions or a GUI based game.
//
// @author Rick Mercer and YOUR NAME
//
public class GameTree {

  // BinaryTreeNode inner class used to create new nodes in the GameTree.
  private class TreeNode {

    // Instance variables
    private String data;
    private TreeNode left;
    private TreeNode right;

    TreeNode(String theData) {
      data = theData;
      left = null;
      right = null;
    }

    // This 2nd constructor is needed in a few methods, like privste build()
    TreeNode(String theData, TreeNode leftLink, TreeNode rightLink) {
      data = theData;
      left = leftLink;
      right = rightLink;
    }
  }

  // Instance variables
  private TreeNode root;
  private TreeNode currentNode;
  private Scanner scanner;
 
  // Constructor needed to create the game. It should open the input 
  // file and call the recursive method build(). The String parameter
  // name is the name of the file from which we need to read the game 
  // questions and answers from.
  //
  public GameTree(String name) {
    // TODO: Complete this constructor. Remember, this needs a try/catch to
    // open the file and a call to the build method code demoped in class.
    root = null;
  }

  // Add a new question and answer to the currentNode. If the current 
  // node is referencing the answer "parrot", 
  //     theGame.add("Does it swim?", "duck"); 
  // should change the GameTree like this:
  //
  // ......Feathers?......................Feathers? 
  // ....../......\......................./......\ 
  // ..parrot....horse.........Does it swim?.....horse
  // ............................./......\
  // ..........................duck.....parrot 
  //
  // @param newQuestion: The question to add where the old answer was.
  // @param newAnswer: The new yes answer to the new question.
  public void add(String newQuestion, String newAnswer) {
    // TODO: Complete this method
  }

  // Return true if getCurrent() is an answer rather than a question. Return false
  // if the current node is an internal node rather than a leaf that is an answer.
  public boolean foundAnswer() {
    // TODO: Complete this method
    return ! false;
  }

  // Return the data for the current node, which could be a
  // question or an answer.
  public String getCurrent() {
    // TODO: Complete this method
    return null;
  }

  // Ask the game to update the current node in the tree by
  // going left for Choice.yes or right for Choice.no 
  // Example code:
  //   theGame.playerSelected(Choice.Yes);
  //
  public void playerSelected(Choice yesOrNo) {
    // TODO: Complete this method
  }

  // Begin a game at the root of the tree. getCurrent should return the question
  // at the root of this GameTree.
  public void reStart() {
    // TODO: Complete this method
  }

  // Overwrite the old file for this gameTree with the current state that may have
  // new questions added since the game started. Get all other method working first
  // Build this method last.
  public void saveGame() {
    // TODO: Complete this method
    // Hint: Call a private helper method with a root argument to do
    // a preorder traversal over the current state of this GameTree
  }

  // Method used to print out a text version of the game file.
  @Override
  public String toString() {
    accumulate = "";
    toString(root, 0);
    return accumulate;
  }

  // Used in both toString methods to add strings like "- - - "
  private String accumulate; 
  
  private void toString(TreeNode node, int lvl) {
    if (node != null) {
      toString(node.right, lvl + 1);
      for (int i = 1; i <= lvl; i++) {
        accumulate += "-  ";
      }
      accumulate = accumulate + node.data + " \n";
      toString(node.left, lvl + 1);
    }

  }
}
