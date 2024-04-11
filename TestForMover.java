package chutesandladdersgame;
// Written by Zach

public class TestForMover {

   public static int testForMover(int startPos) {
      int endPos;
      switch (startPos) {
         case 1:
            endPos = 38;
            break;
         case 4:
            endPos = 15;
            break;
         case 9:
            endPos = 31;
            break;
         case 16:
            endPos = 6;
            break;
         case 21:
            endPos = 42;
            break;
         case 28:
            endPos = 84;
            break;
         case 36:
            endPos = 44;
            break;
         case 47:
            endPos = 26;
            break;
         case 49:
            endPos = 11;
            break;
         case 51:
            endPos = 67;
            break;
         case 56:
            endPos = 53;
            break;
         case 62:
            endPos = 19;
            break;
         case 64:
            endPos = 60;
            break;
         case 71:
            endPos = 91;
            break;
         case 80:
            endPos = 100;
            break;
         case 87:
            endPos = 24;
            break;
         case 93:
            endPos = 73;
            break;
         case 95:
            endPos = 75;
            break;
         case 98:
            endPos = 78;
            break;
         default:
             endPos = startPos;
            break;
      }
      return endPos;
   }
}
// Written by Zach
