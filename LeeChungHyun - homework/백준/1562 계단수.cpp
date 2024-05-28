//N�� �־��� ��, ���̰� N�̸鼭 0���� 9���� ���ڰ� ��� �����ϴ� ��� ���� 
// �� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 0���� �����ϴ� ���� ��ܼ��� �ƴϴ�.
//
//�Է�
//ù° �ٿ� N�� �־�����.N�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.
//
//���
//ù° �ٿ� ������ 1, 000, 000, 000���� ���� �������� ����Ѵ�.

#include<iostream>
using namespace std;

void input();
void dp();

const int MOD = 1000000000;

int N;

// stairs[n][l][i][j] �� 0~n�� �̿���, i�� ����, j�� ������, ���� l�� ��ܼ��� ����
long long stairs[10][101][10][10];

void input() {
	cin >> N;
}

void dp() {

	stairs[0][1][0][0] = 1;

	for (int n = 1; n <= 9; n++) {
		for (int l = n + 1; l <= N; l++) {
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					if (j != 0 && j != n) {
						stairs[n][l][i][j] =
							stairs[n][l - 1][i][j - 1] + stairs[n][l - 1][i][j + 1] % MOD;
					}
					else if (j == n) {
						if (i != n) {
							stairs[n][l][i][n] =
								stairs[n][l - 1][i][n - 1] + stairs[n - 1][l - 1][i][n - 1] % MOD;
						}
						else {
							stairs[n][l][i][n] =
								stairs[n][l - 1][n][n - 1] % MOD;
						}
					}
					else {
						if (i != 0) {
							stairs[n][l][i][0]
								= stairs[n][l - 1][i][1] + stairs[n - 1][l - 1][i - 1][0] % MOD;
						}
						else {
							stairs[n][l][0][0] = stairs[n][l - 1][0][1] % MOD;
						}
					}
				}
			}
		}
	}
}


int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	//FILE* filestream;
	//freopen_s(&filestream, "input.txt", "r", stdin);

	input();
	dp();

	long long ans = 0;

	for (int i = 1; i <= 9; i++) {
		for (int j = 0; j <= 9; j++) {
			ans += stairs[9][N][i][j];
		}
	}

	ans %= MOD;

	cout << ans << endl;

	return 0;

}