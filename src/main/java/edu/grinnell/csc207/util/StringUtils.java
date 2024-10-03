package edu.grinnell.csc207.util;

import edu.grinnell.csc207.linear.Stack;
import edu.grinnell.csc207.linear.LinkedStack;

import java.io.PrintWriter;

/**
 * Assorted utilities for working with strings.
 * 
 * @author Samuel A. Rebelsky
 * @author Richard Lin 
 * @author Anthony Castleberry
 */ 
public class StringUtils {
  // +------------------+--------------------------------------------
  // | Provided methods |
  // +------------------+
    
  /**
   * Determine whether the parens match in string.
   */
  public static boolean checkMatching(String str) throws Exception{
    Stack<Character> parens = new LinkedStack<Character>();
    for(int i = 0; i < str.length(); i++) { 
      if (str.charAt(i) == '(') {
        parens.put('(');
      } else if (str.charAt(i) == '[') {
        parens.put('[');
      } else if (str.charAt(i) == ')') {
        if (parens.isEmpty()) {
          return false;
        } // if
        Character placeholder = parens.get();
        if (placeholder != '(') {
          return false;
        } // if
      } else if (str.charAt(i) == ']') {
        if (parens.isEmpty()) {
          return false;
        } // if
        Character placeholder = parens.get();
        if (placeholder != '[') {
          return false;
        } // if
      } // if
    } // for
    return parens.isEmpty();
  } // checkMatching
} // class StringUtils    

