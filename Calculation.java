class Calculation{

    double func(double x)
    {
        return x * x * x - x - 1;
    }
    void falsi(double a, double b)
    {
    if (func(a) * func(b) > 0)
    {
        System.out.println( "assumed wrong bound");
        return;
    }
    double c = a;
    for (int i = 0; i < 10000; i++)
    {
        c = (a * func(b) - b * func(a)) / (func(b) - func(a));
        if (func(c) == 0)
            break;
        else if (func(a) * func(c) > 0)
        {
            a = c;
        }
        else b=c;
    }
    System.out.println("The value of root is : "+c); 
    
}

}