//크기가 N인 수열 A = A1, A2, ..., AN이 있다.수열의 각 원소 Ai에 대해서 오등큰수 NGF(i)를 구하려고 한다.
//
//Ai가 수열 A에서 등장한 횟수를 F(Ai)라고 했을 때,
// Ai의 오등큰수는 오른쪽에 있으면서 수열 A에서 등장한 횟수가 F(Ai)보다 큰 수 중에서 
// 가장 왼쪽에 있는 수를 의미한다.그러한 수가 없는 경우에 오등큰수는 - 1이다.
//
//예를 들어, A = [1, 1, 2, 3, 4, 2, 1]인 경우 F(1) = 3, F(2) = 2, F(3) = 1, F(4) = 1이다.
// A1의 오른쪽에 있으면서 등장한 횟수가 3보다 큰 수는 없기 때문에, NGF(1) = -1이다.
// A3의 경우에는 A7이 오른쪽에 있으면서 F(A3 = 2) < F(A7 = 1) 이기 때문에, 
// NGF(3) = 1이다.NGF(4) = 2, NGF(5) = 2, NGF(6) = 1 이다.
//
//	입력
//	첫째 줄에 수열 A의 크기 N(1 ≤ N ≤ 1, 000, 000)이 주어진다.
// 둘째에 수열 A의 원소 A1, A2, ..., AN(1 ≤ Ai ≤ 1, 000, 000)이 주어진다.
//
//	출력
//	총 N개의 수 NGF(1), NGF(2), ..., NGF(N)을 공백으로 구분해 출력한다.

#include<iostream>
#include<stack>
using namespace std;

void input();
void search_ngf();

int a[1000001];
int b[1000001];
int c[1000001];
int NGF[1000001];

int N;
stack<int> s;

void input() {
	cin >> N;
	for (int i = 1; i <= N; i++) {
		cin >> a[i];
		b[a[i]]++;
		NGF[i] = -1;
	}
	for (int i = 1; i <= N; i++) {
		c[i] = b[a[i]];
	}
}

void search_ngf() {
	s.push(1);
	for (int i = 2; i <= N; i++) {
		while (!s.empty() && c[s.top()] < c[i]) {
			NGF[s.top()] = a[i];
			s.pop();
		}
		s.push(i);
	}

	for (int i = 1; i <= N; i++) {
		cout << NGF[i] << " ";
	}
	cout << endl;
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	//FILE* filestream;
	//freopen_s(&filestream, "input.txt", "r", stdin);

	input();
	search_ngf();

	return 0;

}