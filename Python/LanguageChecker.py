ENGLISH_WORDS = []

def get_data():
    dict = open('words.txt', 'r')

    for word in dict.read().split('\n'):
        ENGLISH_WORDS.append(word)

    print("[+] Length of provided dict: " + str(len(ENGLISH_WORDS)))
    dict.close()

def count_words(text):
    text = text.upper()

    words = text.upper().split(' ')

    matches = 1
    for word in words:
        if word in ENGLISH_WORDS:
            matches += 1

def isEnglish(text):
    matches = count_words()

    if (float(matches) / len(text.split(' '))) * 100 >= 80:
        return True

    return False

if __name__ == '__main__':
    get_data()

