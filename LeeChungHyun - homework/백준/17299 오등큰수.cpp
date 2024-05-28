//ũ�Ⱑ N�� ���� A = A1, A2, ..., AN�� �ִ�.������ �� ���� Ai�� ���ؼ� ����ū�� NGF(i)�� ���Ϸ��� �Ѵ�.
//
//Ai�� ���� A���� ������ Ƚ���� F(Ai)��� ���� ��,
// Ai�� ����ū���� �����ʿ� �����鼭 ���� A���� ������ Ƚ���� F(Ai)���� ū �� �߿��� 
// ���� ���ʿ� �ִ� ���� �ǹ��Ѵ�.�׷��� ���� ���� ��쿡 ����ū���� - 1�̴�.
//
//���� ���, A = [1, 1, 2, 3, 4, 2, 1]�� ��� F(1) = 3, F(2) = 2, F(3) = 1, F(4) = 1�̴�.
// A1�� �����ʿ� �����鼭 ������ Ƚ���� 3���� ū ���� ���� ������, NGF(1) = -1�̴�.
// A3�� ��쿡�� A7�� �����ʿ� �����鼭 F(A3 = 2) < F(A7 = 1) �̱� ������, 
// NGF(3) = 1�̴�.NGF(4) = 2, NGF(5) = 2, NGF(6) = 1 �̴�.
//
//	�Է�
//	ù° �ٿ� ���� A�� ũ�� N(1 �� N �� 1, 000, 000)�� �־�����.
// ��°�� ���� A�� ���� A1, A2, ..., AN(1 �� Ai �� 1, 000, 000)�� �־�����.
//
//	���
//	�� N���� �� NGF(1), NGF(2), ..., NGF(N)�� �������� ������ ����Ѵ�.

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