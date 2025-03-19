
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Game Chat</title>
    <style>
        /* Style for the scrollable chat/log box */
        .chat-box {
            width: 600px;
            height: 400px;
            border: 1px solid #ccc;
            padding: 10px;
            overflow-y: scroll;
            white-space: pre-wrap;
            background-color: #f0f0f0;
            margin-bottom: 10px;
        }
        /* Style for the input box */
        .input-box {
            width: 500px;
            padding: 5px;
        }
    </style>
</head>
<body>
    <h1>Game Chat</h1>
    <div class="chat-box">
		
    </div>
    
    <form action="index" method="post">
        <input type="text" name="userText" class="input-box" placeholder="Enter your command..." autofocus />
        <input type="submit" value="Send" />
    </form>
</body>
</html>
