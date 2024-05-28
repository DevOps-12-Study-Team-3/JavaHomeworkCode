//�ݵ�� �� ĭ �̻� �̵��� �ؾ� �ϰ�, ���� �ڸ��� �ӹ��� ���� �� ����.��, ���� ĭ�� ���� �� �湮�� �� �ִ�.
//
//�̿� ���� �����ǰ� K, �׸��� �ϳ��� ���ܾ �־����� ��, 
// �̿� ���� ���ܾ ���� �� �ִ� ��ΰ� �� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
//
//���� ������ ���ܾ BREAK�� ��쿡�� ������ ���� 3���� ��ΰ� �����Ѵ�.
// ���� ���� �� ��ȣ, ���� ���� �� ��ȣ�� ��Ÿ����.
//
//(4, 2) (3, 2) (2, 2) (1, 2) (1, 1)
//(4, 2) (3, 2) (2, 2) (1, 2) (1, 3)
//(4, 2) (3, 2) (2, 2) (2, 3) (1, 3)
//�Է�
//ù° �ٿ� N(1 �� N �� 100), M(1 �� M �� 100), K(1 �� K �� 5)�� �־�����.
// ���� N���� �ٿ��� M���� ���ĺ� �빮�ڰ� �־����µ�, �̴� N��M ũ���� �������� ��Ÿ����.
// ���� �ٿ��� 1�� �̻� 80�� ������ ���ܾ �־�����.��� ���ڵ��� ���ĺ� �빮���̸�, ���� ���� �־�����.
//
//���
//ù° �ٿ� ����� ������ ����Ѵ�.�� ���� 231 - 1���� �۰ų� ����.

#include<iostream>
using namespace std;

void input();

int N;
int M;
int K;

char board[101][101];
char str[81];

int len;

int dx[4] = { 1, -1, 0 ,0 };
int dy[4] = { 0 , 0 ,-1 , 1 };

// dp[i][x][y] : ��ǥ (x,y)���� �ε��� 1~i �κй��ڿ��� �����Ǵ� ����� ��
// dp[length K][][]�� summation�� ����
// dp[i][x][y]���� dp[i+1][nx][ny]�� dp[i+1][nx][ny] += dp[i][x][y]

// �ٽ� ���� dp[n][x][y] = sum ( dp[n-1][bx][by] )

int dp[81][101][101];

int cnt;

void input() {
	cin >> N >> M >> K;
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			cin >> board[i][j];
		}
	}
	string s;
	cin >> s;
	len = s.length();
	for (int i = 0; i < s.length(); i++) {
		str[i] = s[i];
	}
}

void dynamic() {
	for (int i = 1; i < K; i++) {
		for()
	}
}

void search(int x, int y, int n) {
	if (n == len) {
		cnt++;
		return;
	}
	for (int i = 0; i < 4; i++) {
		for (int j = 1; j <= K; j++) {
			int nx = x + j * dx[i];
			int ny = y + j * dy[i];
			if (0 <= nx && nx < N && 0 <= ny && ny < M) {
				if (board[nx][ny] == str[n]) {
					search(nx, ny, n + 1);
				}
			}
		}
	}
}

void words_number() {
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			if (board[i][j] == str[0]) {
				search(i, j, 1);
			}
		}
	}
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	FILE* filestream;
	freopen_s(&filestream, "input.txt", "r", stdin);

	input();
	words_number();

	cout << cnt;

	return 0;

}