import sys

ALPHABET = "-ABCDEFGHIJKLMNOPQRSTUVWXYZ"
KEY = 3

def caesar_encrypt(plain_text):
    cipher_text = ""
    for str in plain_text:
        for char in str.upper():
            index = ALPHABET.find(char)
            index = (index + KEY) % len(ALPHABET)
            cipher_text += ALPHABET[index]
    return cipher_text

def caesar_decrypt(cipher_text):
    plain_text = ""
    for str in cipher_text:
        for char in str.upper():
            index = ALPHABET.find(char)
            index = (index - KEY) % len(ALPHABET)
            plain_text += ALPHABET[index]
    return plain_text

def main():
    print(sys.argv)
    if sys.argv[1] == "-e":
       print(caesar_encrypt(sys.argv[2:]))
    elif sys.argv[1] == "-d":
        print(caesar_decrypt(sys.argv[2:]))
    else:
        print("[-]Invalid Args") 

if __name__ == "__main__":
    main()