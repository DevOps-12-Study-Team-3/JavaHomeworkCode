//N이 주어질 때, 길이가 N이면서 0부터 9까지 숫자가 모두 등장하는 계단 수가 
// 총 몇 개 있는지 구하는 프로그램을 작성하시오. 0으로 시작하는 수는 계단수가 아니다.
//
//입력
//첫째 줄에 N이 주어진다.N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
//
//출력
//첫째 줄에 정답을 1, 000, 000, 000으로 나눈 나머지를 출력한다.

#include<iostream>
using namespace std;

void input();
void dp();

const int MOD = 1000000000;

int N;

// stairs[n][l][i][j] 는 0~n을 이용한, i로 시작, j로 끝나는, 길이 l인 계단수의 개수
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