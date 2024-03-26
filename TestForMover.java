package chutesandladdersgame;
// Written by Zach

public class TestForMover {
   public TestForMover() {
   }

   public int testForMover(int startPos) {
      int endPos = startPos;
      switch (startPos) {
         case 1:
            endPos = 38;
         case 4:
            endPos = 15;
         case 9:
            endPos = 31;
         case 16:
            endPos = 6;
         case 21:
            endPos = 42;
         case 28:
            endPos = 84;
         case 36:
            endPos = 44;
         case 47:
            endPos = 26;
         case 49:
            endPos = 11;
         case 51:
            endPos = 67;
         case 56:
            endPos = 53;
         case 62:
            endPos = 19;
         case 64:
            endPos = 60;
         case 71:
            endPos = 91;
         case 80:
            endPos = 100;
         case 87:
            endPos = 24;
         case 93:
            endPos = 73;
         case 95:
            endPos = 75;
         case 98:
            endPos = 78;
         default:
            return endPos;
      }
   }
}
// Written by Zach
