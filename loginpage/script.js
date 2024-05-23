document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const errorMessage = document.getElementById('errorMessage');
    
    // 仮のユーザー名とパスワードのチェック
    if (username === 'user' && password === 'pass') {
        alert('ログイン成功！');
        // ここにログイン成功時の処理を追加
    } else {
        errorMessage.textContent = 'ユーザー名またはパスワードが間違っています。';
    }
});
