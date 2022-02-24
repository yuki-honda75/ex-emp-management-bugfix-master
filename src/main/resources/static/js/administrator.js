$(function(){
  $('#confirmPassword').on('keyup', function(){
    let hostUrl = 'http://localhost:8080/toInsert/checkpass';
    let password = $('#password').val();
    let confirmPassword = $('#confirmPassword').val();
    $.ajax({
      url: hostUrl,
      type: 'post',
      dataType: 'json',
      data: {
        password: password,
        confirmPassword: confirmPassword
      },
      async: true
    }).done((data)=>{
        console.log(data);
        console.dir(JSON.stringify(data));
        $('#checkMessage').text(data.checkMessage);
    }).fail((XMLHttpRequest, textStatus, errorThrown)=>{
        alert('エラーが発生しました');
        console.log('XMLHttpRequest' + XMLHttpRequest.status);
        console.log('textStatus' + textStatus);
        console.log('errorThrown' + errorThrown.message);
    });
  });
});