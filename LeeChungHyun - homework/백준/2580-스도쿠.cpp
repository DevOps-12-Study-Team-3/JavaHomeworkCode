//���� ���� �� ������ �ǿ� ���� �ִ� ���ڵ��� ������ �־��� �� ��� �� ĭ�� ä���� ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//��ȩ �ٿ� ���� �� �ٿ� 9���� ���� ���� �� �������� �� �ٿ� ���� �ִ� ���ڰ� �� ĭ�� ����� ���ʷ� �־�����.
//������ ���� �� ĭ�� ��쿡�� 0�� �־�����.������ ���� ��Ģ��� ä�� �� ���� ����� �Է��� �־����� �ʴ´�.
//
//���
//��� �� ĭ�� ä���� ������ ���� ���� ����� ��ȩ �ٿ� ���� �� �ٿ� 9���� �� ĭ�� ����� ����Ѵ�.
//
//������ ���� ä��� ����� ������ ���� �� �� �ϳ����� ����Ѵ�.

#include <iostream>
using namespace std;

const int MAX = 9 * 9;

// x, y ��ǥ ����ü
struct position {
    int x;
    int y;
};

// ������ �迭
int sdoku[9][9];

// ��ĭ ����
int blank_num;

// ��ĭ �迭
position blank[MAX];

// ������ �Ϸ� üũ
bool is_end = false;

// ������ ����
void input() {
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            cin >> sdoku[i][j];
            if (sdoku[i][j] == 0) {
                // ��ĭ ���� ����
                blank[blank_num].x = i;
                blank[blank_num].y = j;
                blank_num++;
            }
        }
    }
}

// �������� ���� üũ
// üũ�� ����� �����ϸ� üũ�� ������ ��Ʈ��ŷ ���� n�� � ���� �ִ����� ���� ���� i�� ����, �׸��� �׿� ���ؼ��� �޶����� �޼ҵ�
// -> ������ n, i  ������ bool
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

// ��Ʈ��ŷ�� "�� ����"�� ���� �޶����� �޼ҵ��̹Ƿ� ������ ���� n, ������ void
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