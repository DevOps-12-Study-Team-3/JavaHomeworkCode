#include <iostream>
using namespace std;

const int MAX = 15;

int N;
int ans;
int queen_col[MAX];

// 현재 체스판에서 퀸을 놓는 것이 유효한지 체크
bool check(int current_row, int i) {
    for (int row = 0; row < current_row; row++) {
        if (queen_col[row] == i ||  // 같은 열에 다른 퀸이 있는 경우
            abs(queen_col[row] - i) == abs(row - current_row)) {  // 대각선에 다른 퀸이 있는 경우
            return false;
        }
    }
    return true;
}

// 현재 행 current_row에 대해 백트래킹 진행
void backtrack(int current_row) {
    if (current_row == N) {
        ans++;
    }
    else {
        for (int i = 0; i < N; i++) {
            queen_col[current_row] = i;
            if (check(current_row, i)) {
                backtrack(current_row + 1);
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    // FILE* filestream;
    // freopen_s(&filestream, "input.txt", "r", stdin);

    cin >> N;

    // 백트래킹 시작
    backtrack(0);

    // 결과 출력
    cout << ans << endl;

    return 0;
}