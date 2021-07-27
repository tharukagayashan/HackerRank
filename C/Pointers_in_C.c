#include <stdio.h>

void update(int *a,int *b) {
    
    int a1 = *a,b1 = *b;
    int a2 = *a,b2 = *b;
    
    *a = a1 + b1;
    
    if(a2 < b2){
        *b = (b2)-(a2);
    }
    else {
        *b = (a2-b2);
    }   
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
