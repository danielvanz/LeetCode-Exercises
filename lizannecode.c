void name(int i)
{
    switch (i)
    {
    case 1:
        printf("one\n");
    case 2:
        printf("two\n");
    case 3:
        printf("three\n");
    case 4:
        printf("four\n");
    case 5:
        printf("five\n");
    case 6:
        printf("six\n");
    case 7:
        printf("seven\n");
    case 8:
        printf("eight\n");
    case 9:
        printf("nine\n");
    default:;
    }
}

void print(int i)
{
    if (i < 10 && i > 0)
    {
        name(i);
    }
    else if (i % 2 == 0)
    {
        printf("even\n");
    }
    else
    {
        printf("odd\n");
    }
}

int main()
{
    int a = 8;
    int b = 11;

    for (int i = a; i <= b; i++)
    {
        print(i);
    }
    return 0;
}