# java-todo-app
## 概要
SpringBootを使用したTODO Webアプリケーションです。  
DBへの接続処理も含め、Webアプリケーションの基本的な処理は一通り実装しているので、後ほどリファレンスとしても使用可能です。

## Qiita
https://qiita.com/ryohei0109_develop/items/d1d13c754d22b43f7d93

## 画面イメージ
### TODO 一覧画面
<img width="1440" alt="スクリーンショット 2021-07-04 17 26 38" src="https://user-images.githubusercontent.com/69568236/124378586-26b9c200-dced-11eb-96c2-e03d370b5559.png">
### TODO 詳細画面
<img width="958" alt="スクリーンショット 2021-07-04 17 28 49" src="https://user-images.githubusercontent.com/69568236/124378622-5d8fd800-dced-11eb-8c7d-35eaa5d2e36f.png">

## スキルセット
- IDE: SpringToolSuite 4
- Java: OpenJDK 16  
- SpringBoot: 2.5.2  
- TemplateEngine: Thymeleaf  
- O/RM: Spring JDBC
- BuildTool: Maven  
- DB: MySQL 8.0.23  

## ファイル説明
### リソース
- /db.sql  
    MySQL用 DB・テーブル作成用クエリ
### Controller
- /src/main/java/com/todo/pkg/controller/DetailController.java  
    詳細画面・作成/更新/削除受付コントローラー
- /src/main/java/com/todo/pkg/controller/IndexController.java  
    一覧画面表示処理を実装したコントローラー
### Model
- /src/main/java/com/todo/pkg/model/Todo.java
    todosテーブルをモデリングしたクラス
- /src/main/java/com/todo/pkg/model/TodoRepository.java  
    todosテーブルのリポジトリクラス

### View
- /src/main/resources/templates/index.html  
    TODO 一覧画面
- /src/main/resources/templates/detail.html  
    TODO 作成・編集画面
- /src/main/resources/templates/common/footer.html  
    全ページ共通footer部分
- /src/main/resources/templates/common/head.html  
    全ページ共通head部分
- /src/main/resources/templates/common/header.html  
    全ページ共通header部分
- /src/main/resources/templates/common/scripts.html  
    全ページ共通scripts

### CSS
- /src/main/resources/static/css/common.css  
    全ページ共通CSS
- /src/main/resources/static/css/detail.css  
    詳細ページ用CSS
- /src/main/resources/static/css/index.css  
    一覧画面用CSS

### JavaScript
※本プロジェクトではJavaScriptを使用していませんが、参考のためファイルの配置・呼び出し処理行っています。
- /src/main/resources/static/scripts/base.js  
    全ページ共通JavaScript
- /src/main/resources/static/scripts/detail.js  
    詳細ページ用JavaScript
- /src/main/resources/static/scripts/baindexse.js  
    一覧ページ用JavaScript
