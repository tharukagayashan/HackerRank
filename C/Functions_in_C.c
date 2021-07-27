#include <stdio.h>

int max_of_four(int a, int b, int c, int d){
    
    int arr[4] = {a,b,c,d};
    int maxVal = 0;
    for (int i = 0; i < 4; i++) {
        maxVal = arr[i];
        for (int j=0; j<4; j++) {
            if(maxVal < arr[j]){
                maxVal = arr[j];
            }
        }
    }
       return maxVal;
}

int main() {
    int a, b, c, d;
    scanf("%d\n %d\n %d\n %d\n", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}
