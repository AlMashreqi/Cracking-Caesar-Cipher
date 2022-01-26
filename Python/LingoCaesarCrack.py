ENGLISH_WORDS = []
ALPHABET = "-ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def get_data():
    dict = open('words.txt', 'r')

    for word in dict.read().split('\n'):
        ENGLISH_WORDS.append(word)

    print("[+] Length of provided dict: " + str(len(ENGLISH_WORDS)))
    dict.close()

def count_words(text):
    text = text.upper()

    words = text.upper().split('-')

    matches = 1
    for word in words:
        if word in ENGLISH_WORDS:
            matches += 1
    return matches

def isEnglish(text):
    matches = count_words(text)
    if ((float(matches) / len(text.split('-'))) * 100) >= 70:
        return True

    return False


def crack_caesar(cipher):
    for key in range(len(ALPHABET)):
        plain_text = ""
        for char in cipher:
            index = ALPHABET.find(char)
            index = (index - key) % len(ALPHABET)
            plain_text += ALPHABET[index]
        if isEnglish(plain_text):
            print(f"[?] Key: {key} => Decrypted Text: {plain_text}")

if __name__ == '__main__':
    get_data()
    crack_caesar("WKLVCLVCDCPHVVDJH".upper())
