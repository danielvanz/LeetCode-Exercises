public class solvingExercise1algorithms {

    int backtrack(A, i, currentColors) {

        foundColor = false;

        if allNodesHaveColor(A)
            then minCost <- min(minCost, currentColors.length)
            else for each color in currentColors
                // for each j in linkedList(A[i])
                    f(i) = color //f is coloring function for nodes
                        if f(i) != f(j)
                        foundColor = true;
                        minCost <- min(minCost, backtrack(A, j, currentColors))

            if !foundColor
                then currentColors.add(currentColors.size())
                f(i) = currentColors.get(currentColors.size() -1)
                    // for each j in linkedList(A[i])
                        minCost <- min(minCost, backtrack(A, j, currentColors))

        return minCost;
    }

}

backtrack(A, i, currentColors) 

    minColorings = 0;
    foundColor = false;

    for each color in currentColors
      do isGoodColor = true;
        f(i) = color;
        for each j in A[i]
            if f(i) == f(j)
                then isGoodColor = false;
                break;
        if isGoodColor 
            then 
            for each j in A[i]
                if f(j) == null
                  then
                    foundColor = true;
                    minColorings = min{backtrack(A, j, currentColors};
                    break-out-of-both-loops;
                
            

    if allNodesHaveColor(A)
        then return currentColors.length
     else if !foundColor
        then currentColors.add(currentColors.size() + 1);
        f(i) = CurrentColors.get(currentColors.size());
            for each j in A[i]
                if f(j) == null 
                  then
                    minColorings = min{backtrack(A, j, currentColors};
                

    return minColorings;
