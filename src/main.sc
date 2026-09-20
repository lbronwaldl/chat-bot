theme: /

    state: hello
        intent!: /hello
        a: Привет! Я бот-помощник. Я могу рассказать о погоде и курсах валют.

    state: weather
        intent!: /weather
        a: Сейчас я могу рассказать о прогнозе погоды.

    state: currency
        intent!: /currency
        a: Сейчас я могу рассказать о курсах валют.

    state: NoMatch
        event!: noMatch
        a: Извините, я не понял запрос. Попробуйте спросить о погоде или курсе валют.