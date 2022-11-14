import java.util.ArrayList;

public class Jim {

    enum Direction {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }
    

    static int amountOfInputs;
    static String input; 
    static int distance = 0;
    static int maxY = 0;
    static int minY = 0;
    static int maxX = 0;
    static int minX = 0;
    static int y = 0;
    static int x = 0;
    static ArrayList<Integer> yCoords = new ArrayList<>();
    static ArrayList<Integer> xCoords = new ArrayList<>();
    
    static Direction direction = Direction.NORTH;

    public static void main(String[] args) {

        //String inputUnfiltered = "1 FFFR 4";
        //String inputUnfiltered = "9 F 6 R 1 F 4 RFF 2 LFF 1 LFFFR 1 F 2 R 1 F 5";
        //String inputUnfiltered = "14 L 1 FR 1 FFFFFL 1 FFFFL 1 F 12 L 1 F 12 L 1 F 12 L 1 FFFFL 1 FFFFFFFFR 1 FFFR 1 FFFL 1";
        //String inputUnfiltered = "32 FFRFLFLFFRFRFLFF 3 R 1 FFLFRFRFLFFF 3 R 1 FFFFFF 3 L 1 FFFRFLFLFRFF 2 R 1 FFFRFLFLFRFF 3 R 1 FFFFFF 1 L 1 FFRFLFLFFRFRFLFF 3 R 1 FFLFRFRFFLFLFRFF 2 L 1 FFLFRFRFFLFLFRFF 3 R 1 FFRFLFLFFRFRFLFF 2 R 1 FFRFLFLFFRFRFLFF 2 L 1 FFFFFF 3 R 1 FFFRFLFLFRFF 5 R 1 FFLFRFRFLFFF 1 L 1 FFLFRFRFFLFLFRFF 2 R 1 FFRFLFLFFRFRFLFF 2 L 1";
        String inputUnfiltered = "10 FFLFRFRFFLFLFRFF 5 L 1 FFFRFLFLFRFF 4 L 1 FFLFRFRFFLFLFRFF 8 L 1 FFLFRFRFFLFLFRFF 4 L 1 FFFFFF 3 R 1";
        
        splitString(inputUnfiltered);

        startGame();
        
    }


    private static void startGame() {
        String[] steps = input.split(" ");
        
        for (int i = 0; i < amountOfInputs * 2; i = i + 2) {
            String step = steps[i];
            int times = Integer.parseInt(steps[i + 1]);

            ArrayList<String> oneStep = splitSteps(step);
    
            for (int j = 0; j < times; j++) {
                for (int j2 = 0; j2 < oneStep.size(); j2++) {
                    String s = oneStep.get(j2);
                    if (s.equals("F")) {
                        distance++;

                        if (direction == Direction.NORTH) {
                            y++;
                        }
                        else if (direction == Direction.EAST) {
                            x++;
                        }
                        else if (direction == Direction.SOUTH) {
                            y--;
                        }
                        else{
                            x--;
                        }

                        if (y > maxY) {
                            maxY = y;
                        }
                        else if (y < minY) {
                            minY = y;
                        }
                        else if (x > maxX) {
                            maxX = x;
                        }
                        else if (x < minX) {
                            minX = x;
                        }

                        yCoords.add(y);
                        xCoords.add(x);

                    }
                    else if (s.equals("R")){
                        changeDirectionR();
                    }
                    else if (s.equals("L")){
                        changeDirectionL();
                    }


                }
            }

            oneStep.clear();

            
        }

        System.out.print(distance + " ");

        calculateRA();

        calculateArea();

        checkPockets();
    }


    private static void checkPockets() {
        for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
                
                


            }
        }
    }


    private static void calculateArea() {
        int left = 0;
        int right = 0;

        for (int i = 0; i < xCoords.size() -1; i++) {
            left = left + (xCoords.get(i) * yCoords.get(i+1));
        }

        for (int i = 0; i < yCoords.size() -1; i++) {
            right = right + (yCoords.get(i) * xCoords.get(i+1));
        }

        int answer = Math.abs((left - right)/2);

        System.out.print(answer + " ");


    }


    private static void calculateRA() {
        int xLength = maxX + Math.abs(minX);
        int yLength = maxY + Math.abs(minY);

        System.out.print(xLength * yLength + " ");

    }


    private static void changeDirectionR() {
        if (direction == Direction.NORTH) {
            direction = Direction.EAST;
        }
        else if (direction == Direction.EAST) {
            direction = Direction.SOUTH;
        }
        else if (direction == Direction.SOUTH) {
            direction = Direction.WEST;
        }
        else{
            direction = Direction.NORTH;
        }
    }


    private static void changeDirectionL() {
        if (direction == Direction.NORTH) {
            direction = Direction.WEST;
        }
        else if (direction == Direction.EAST) {
            direction = Direction.NORTH;
        }
        else if (direction == Direction.SOUTH) {
            direction = Direction.EAST;
        }
        else{
            direction = Direction.SOUTH;
        }
    }


    private static ArrayList<String> splitSteps(String step) {
        ArrayList<String> oneStep = new ArrayList<>();

        for (int j = 0; j < step.length(); j++) {
            String command = step.substring(j, j+1);
            oneStep.add(command);
        }

        return oneStep;
    }


    private static void splitString(String inputUnfiltered) {

        String arr[] = inputUnfiltered.split(" ", 2);
        amountOfInputs = Integer.parseInt(arr[0]);
        input = arr[1];
    }
    
}