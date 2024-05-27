//게임 시작 전 스도쿠 판에 쓰여 있는 숫자들의 정보가 주어질 때 모든 빈 칸이 채워진 최종 모습을 출력하는 프로그램을 작성하시오.
//
//입력
//아홉 줄에 걸쳐 한 줄에 9개씩 게임 시작 전 스도쿠판 각 줄에 쓰여 있는 숫자가 한 칸씩 띄워서 차례로 주어진다.
//스도쿠 판의 빈 칸의 경우에는 0이 주어진다.스도쿠 판을 규칙대로 채울 수 없는 경우의 입력은 주어지지 않는다.
//
//출력
//모든 빈 칸이 채워진 스도쿠 판의 최종 모습을 아홉 줄에 걸쳐 한 줄에 9개씩 한 칸씩 띄워서 출력한다.
//
//스도쿠 판을 채우는 방법이 여럿인 경우는 그 중 하나만을 출력한다.

#include <iostream>
using namespace std;

const int MAX = 9 * 9;

// x, y 좌표 구조체
struct position {
    int x;
    int y;
};

// 스도쿠 배열
int sdoku[9][9];

// 빈칸 개수
int blank_num;

// 빈칸 배열
position blank[MAX];

// 스도쿠 완료 체크
bool is_end = false;

// 스도쿠 저장
void input() {
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            cin >> sdoku[i][j];
            if (sdoku[i][j] == 0) {
                // 빈칸 정보 저장
                blank[blank_num].x = i;
                blank[blank_num].y = j;
                blank_num++;
            }
        }
    }
}

// 스도쿠의 정합 체크
// 체크의 방식을 생각하면 체크는 현재의 백트래킹 깊이 n과 어떤 수를 넣는지에 대한 숫자 i에 따라, 그리고 그에 의해서만 달라지는 메소드
// -> 변수는 n, i  리턴은 bool
bool check(int n, int i) {
    for (int j = 0; j < 9; j++) {
        if (sdoku[blank[n].x][j] == i || sdoku[j][blank[n].y] == i) return false;
    }

    int pos_x = 3 * (blank[n].x / 3);
    int pos_y = 3 * (blank[n].y / 3);

    for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
            if (sdoku[pos_x + j][pos_y + k] == i) return false;
        }
    }

    return true;
}

// 백트래킹은 "각 깊이"에 따라 달라지는 메소드이므로 변수는 깊이 n, 리턴은 void
void backtracking(int n) {
    if (is_end == true) {
        return;
    }
    if (n == blank_num) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cout << sdoku[i][j] << " ";
            }
            cout << endl;
        }
        is_end = true;
        return;
    }
    for (int i = 1; i <= 9; i++) {
        if (check(n, i)) {
            sdoku[blank[n].x][blank[n].y] = i;
            backtracking(n + 1);
            sdoku[blank[n].x][blank[n].y] = 0;
        }
    }

}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    //   FILE* filestream;
    //    freopen_s(&filestream, "input.txt", "r", stdin);

    input();

    backtracking(0);


    return 0;
}