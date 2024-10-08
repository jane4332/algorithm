# [level 1] 자릿수 더하기 - 12931 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12931) 

### 성능 요약

메모리: 71.8 MB, 시간: 0.22 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 09월 11일 23:32:08

### 문제 설명

<p>자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.<br>
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.</p>

<h5>제한사항</h5>

<ul>
<li>N의 범위 : 100,000,000 이하의 자연수</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>N</th>
<th>answer</th>
</tr>
</thead>
        <tbody><tr>
<td>123</td>
<td>6</td>
</tr>
<tr>
<td>987</td>
<td>24</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>입출력 예 #1<br>
문제의 예시와 같습니다.</p>

<p>입출력 예 #2<br>
9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges

## 문제점

- 자릿수 마다 어떻게 나눌지를 고민했음  그냥 나는 문자열 배열에 글자 하나하나씩을 넣고싶었는데 split 하는 방법 말고 다른방법을 찾으려고 햇으나 split 말고는 내가 원하는 방식으로 집어넣는걸 찾지못했음
- charAt(i) 로 시도하려고 했으나 for 문 내에서 숫자로 변환후 더할시  parseInt()안에는 sting 이 들어가야하는데 char 형태로 들어가서 두번의 형태변환이 필요했음… 그래서 비효율적이었기에 split() 선택
- while 문으로 처리한 사람들도 많았음 ⇒ 10으로 나눠가며 나머지 더하기 ⇒ 다시 몫으로 남은 정수만 다시 n 에집어넣고 하는방식으로 더해서 처리하는거였는데 이런식으로 처리해도 쉬울것 같았다. 타입변환 없이 할 수 있는 알고리즘이라고 생각
