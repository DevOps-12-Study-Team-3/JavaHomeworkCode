//�־��� ������׷��� ����, ���� ū ���簢���� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù �࿡�� N(1 �� N �� 100, 000) �� �־�����.N�� ������׷��� ���� ĭ�� ���̴�.
// ���� N �࿡ ���� �� ĭ�� ���̰� ���ʿ������� ���ʴ�� �־�����.�� ĭ�� ���̴� 1, 000, 000, 000���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
//
//���
//ù° �ٿ� ���� ū ���簢���� ���̸� ����Ѵ�.�� ���� 20���� ���� �ʴ´�.

#include<iostream>

#include<stack>

using namespace std;

const int MAX = 100000;

// ���� ����
int N;

// ���� ũ��
long long s[MAX];

// next smaller first idx 
int nsi[MAX];

// before smaller first idx
int bsi[MAX];

// �ִ� ����
long long max_size;


void input() {
	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> s[i];
		nsi[i] = N;
		bsi[i] = -1;
	}
}

void search_smaller() {

	stack<int> st1;
	st1.push(0);
	for (int i = 1; i < N; i++) {
		while (!st1.empty() && s[i] < s[st1.top()]) {
			nsi[st1.top()] = i;
			st1.pop();
		}
		st1.push(i);
	}

	stack<int> st2;
	st2.push(N - 1);
	for (int i = N - 2; i >= 0; i--) {
		while (!st2.empty() && s[i] < s[st2.top()]) {
			bsi[st2.top()] = i;
			st2.pop();
		}
		st2.push(i);
	}

}

long long search_maxsize() {

	for (int i = 0; i < N; i++) {
		if (max_size < (nsi[i] - bsi[i] - 1) * s[i]) {
			max_size = (nsi[i] - bsi[i] - 1) * s[i];
		}
	}
	return max_size;
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	//FILE* filestream;
	//freopen_s(&filestream, "input.txt", "r", stdin);

	input();

	search_smaller();

	cout << search_maxsize();

}