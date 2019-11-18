class calculation{
    double EPSILON = 0.001; 
    double func(double x) 
    { 
        return x * x * x - x * x + 2; 
    } 


    double derivFunc(double x) 
    { 
        return 3 * x * x - 2 * x; 
    } 


    void newtonRaphson(double x) 
    { 
        double h = func(x) / derivFunc(x); 
        while (Math.abs(h) >= EPSILON) 
        { 
            h = func(x) / derivFunc(x); 
      
            
            x = x - h; 
        } 
      
        System.out.print(" root is : "+x); 
    } 



}