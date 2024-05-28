//N - Queen ������ ũ�Ⱑ N �� N�� ü���� ���� �� N���� ���� ������ �� ���� ���� �����̴�.
//
//N�� �־����� ��, ���� ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� N�� �־�����. (1 �� N < 15)
//
// ���
// ù° �ٿ� �� N���� ���� ������ �� ���� ���� ����� ���� ����Ѵ�.

#include <iostream>
using namespace std;

const int MAX = 15;

int N;
int ans;
int queen_col[MAX];

// ���� ü���ǿ��� ���� ���� ���� ��ȿ���� üũ
bool check(int current_row, int i) {
    for (int row = 0; row < current_row; row++) {
        if (queen_col[row] == i ||  // ���� ���� �ٸ� ���� �ִ� ���
            abs(queen_col[row] - i) == abs(row - current_row)) {  // �밢���� �ٸ� ���� �ִ� ���
            return false;
        }
    }
    return true;
}

// ���� �� current_row�� ���� ��Ʈ��ŷ ����
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

    // ��Ʈ��ŷ ����
    backtrack(0);

    // ��� ���
    cout << ans << endl;

    return 0;
}