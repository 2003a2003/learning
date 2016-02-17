# learning
learning
git init
git add - добавить файлы
git commit -m " " - добавить комментарий
git pash - закинуть на сервер


git clone ваша_ссылка  - переписать на ПК
git status - посмотреть изменения
http://nikita-petrov.com/drupal/kak-rabotat-s-github-repozitoriyami 

Наш проект может размещатся в любом каталоге. Для него нужно инициализировать git. Это стандартная процедура:

git init
git add .
git commit -m "Init"
Теперь для проекта git работает и его можно использовать по своему усмотрению: добавлять версии, смотреть логи, делать ветки и т.п.

Для связи с GitHub'ом следует указать удаленный репозиторий:

git remote add origin https://github.com/USER/demo.git
git push -u origin master
Этот код указывает адрес уделенного и отправляет все изменения на гитхабовский сервер. Если мы зайдем на страницу репозитория на гитхабе, то также увидим свой проект.
