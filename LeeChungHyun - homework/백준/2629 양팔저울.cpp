// 첫째 줄에는 추의 개수가 자연수로 주어진다.
// 추의 개수는 30 이하이다.
// 둘째 줄에는 추의 무게들이 자연수로 가벼운 것부터 차례로 주어진다.
// 같은 무게의 추가 여러 개 있을 수도 있다.
// 추의 무게는 500g이하이며, 입력되는 무게들 사이에는 빈칸이 하나씩 있다.
// 세 번째 줄에는 무게를 확인하고자 하는 구슬들의 개수가 주어진다.
// 확인할 구슬의 개수는 7이하이다.
// 네 번째 줄에는 확인하고자 하는 구슬들의 무게가 자연수로 주어지며, 
// 입력되는 무게들 사이에는 빈 칸이 하나씩 있다.
// 확인하고자 하는 구슬의 무게는 40, 000보다 작거나 같은 자연수이다.
//
//출력
//주어진 각 구슬의 무게에 대하여 확인이 가능하면 Y, 아니면 N 을 차례로 출력한다.
// 출력은 한 개의 줄로 이루어지며, 각 구슬에 대한 답 사이에는 빈칸을 하나씩 둔다.

#include<iostream>
using namespace std;

void input();
void dp();

int N;
int weight[31];
int M;
int bead[8];

bool measure[15001][31] = { false };

void input() {
	cin >> N;
	for (int i = 1; i <= N; i++) {
		cin >> weight[i];
	}

	cin >> M;
	for (int i = 1; i <= M; i++) {
		cin >> bead[i];
	}
}

void dp() {

	measure[0][0] = true;

	for (int j = 1; j <= 30; j++) {
		for (int i = 0; i <= 15000; i++) {
			if (measure[i][j - 1] == true) {
				measure[i][j] = true;
			}
			if (i + weight[j] <= 15000) {
				if (measure[i + weight[j]][j - 1] == true) {
					measure[i][j] = true;
				}
			}
			if (measure[abs(i - weight[j])][j - 1] == true) {
				measure[i][j] = true;
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

	for (int i = 1; i <= M; i++) {
		if (bead[i] > 15000) {
			cout << 'N' << " ";
		}
		else {
			if (measure[bead[i]][N] == 0) {
				cout << 'N' << " ";
			}
			else {
				cout << 'Y' << " ";
			}
		}
	}

	cout << endl;

	return 0;

}