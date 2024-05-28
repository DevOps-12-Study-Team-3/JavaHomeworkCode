//0은 빈 칸, 1은 집, 2는 치킨집이다.
//
//(2, 1)에 있는 집과(1, 2)에 있는 치킨집과의 거리는 | 2 - 1 | +| 1 - 2 | = 2, (5, 5)에 있는 
// 치킨집과의 거리는 | 2 - 5 | +| 1 - 5 | = 7이다.따라서, (2, 1)에 있는 집의 치킨 거리는 2이다.
//
//(5, 4)에 있는 집과(1, 2)에 있는 치킨집과의 거리는 | 5 - 1 | +| 4 - 2 | = 6, (5, 5)에 있는 
// 치킨집과의 거리는 | 5 - 5 | +| 4 - 5 | = 1이다.따라서, (5, 4)에 있는 집의 치킨 거리는 1이다.
//
//이 도시에 있는 치킨집은 모두 같은 프랜차이즈이다.프렌차이즈 본사에서는 수익을 증가시키기 위해 일부 
// 치킨집을 폐업시키려고 한다.오랜 연구 끝에 이 도시에서 가장 수익을 많이 낼 수 있는  치킨집의 개수는 최대 M개라는 사실을 알아내었다.
//
//도시에 있는 치킨집 중에서 최대 M개를 고르고, 나머지 치킨집은 모두 폐업시켜야 한다.
// 어떻게 고르면, 도시의 치킨 거리가 가장 작게 될지 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 N(2 ≤ N ≤ 50)과 M(1 ≤ M ≤ 13)이 주어진다.
//
//둘째 줄부터 N개의 줄에는 도시의 정보가 주어진다.
//
//도시의 정보는 0, 1, 2로 이루어져 있고, 0은 빈 칸, 1은 집, 2는 치킨집을 의미한다.집의 개수는 2N개를 넘지 않으며, 적어도 1개는 존재한다.치킨집의 개수는 M보다 크거나 같고, 13보다 작거나 같다.
//
//출력
//첫째 줄에 폐업시키지 않을 치킨집을 최대 M개를 골랐을 때, 도시의 치킨 거리의 최솟값을 출력한다.

#include<iostream>
#include<stack>
using namespace std;

void input();
void backtracking(int n);

struct coordinate {
	int x;
	int y;
};

int distance(coordinate a, coordinate b);

// NxN 크기 도시 최대 50
int N;

// 고를 치킨집 수 최대 13
int M;

// 집은 최대 100개
coordinate house[101];

// 치킨집 최대 13
coordinate chicken[14];

// 고른 치킨집 골라지면 true
bool chosen[14];

// 집 수
int h;

// 치킨집 수
int c;

// 치킨 거리 
int ans = 50 * 2 * 13;

void input() {

	cin >> N >> M;

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			int p;
			cin >> p;
			if (p == 1) {
				h++;
				house[h].x = i;
				house[h].y = j;
			}
			else if (p == 2) {
				c++;
				chicken[c].x = i;
				chicken[c].y = j;
			}
		}
	}
}

int distance(coordinate a, coordinate b) {
	return abs(a.x - b.x) + abs(a.y - b.y);
}

int chicken_distance() {
	int dis = 0;
	for (int i = 1; i <= h; i++) {
		int temp = 2 * 50;
		for (int j = 1; j <= c; j++) {
			if (chosen[j]) {
				temp = min(temp, distance(house[i], chicken[j]));
			}
		}
		dis += temp;
	}
	return dis;
}

void backtracking(int n) {
	if (n == M) {
		ans = min(ans, chicken_distance());
		return;
	}
	for (int i = 1; i <= c; i++) {
		if (chosen[i]) {
			return;
		}
		else {
			chosen[i] = true;
			backtracking(n + 1);
			chosen[i] = false;
		}
	}
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	//FILE* filestream;
	//freopen_s(&filestream, "input.txt", "r", stdin);

	input();
	backtracking(0);
	cout << ans;

	return 0;

}