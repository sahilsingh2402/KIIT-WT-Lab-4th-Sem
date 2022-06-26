#include <stdio.h>
#include <string.h>
#define MAX 10
struct name
{
    char name[20];
    int age;
    char sex[15];
    char dob[15];
};

void display_female(struct name arr_name[])
{
    printf("Sl No.\tName\tAge\tDOB(DD/MM/YY)");
    int sl_no = 1;
    for (int j = 0; j < MAX; j++)
    {
        if (arr_name[j].sex != "Female" || arr_name[j].sex != "female")
        {
            printf("%d\t%s\t%d\t%s", sl_no, arr_name[j].name, arr_name[j].age, arr_name[j].dob);
        }
        sl_no++;
    }
}

int main()
{
    struct name arr_name[MAX];
    for (int i = 0; i < MAX; i++)
    {
        printf("Enter details: ");
        printf("\nEnter Name: ");
        scanf("%s", arr_name[i].name);
        printf("\nEnter Age: ");
        scanf("%d", &arr_name[i].age);
        printf("\nEnter Sex: ");
        scanf("%s", arr_name[i].sex);
        printf("\nEnter DOB: ");
        scanf("%s", arr_name[i].dob);
    }
    display_female(arr_name);
    return 0;
}
