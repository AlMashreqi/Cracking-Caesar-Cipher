ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def crack_caesar(cipher):
    for key in range(len(ALPHABET)):
        plain_text = ""
        for char in cipher:
            index = ALPHABET.find(char)
            index = (index-key) % len(ALPHABET)
            plain_text += ALPHABET[index]
        
        print(f"[?] Key: {key} => Decrypted Text: {plain_text}")

if __name__ == '__main__':
    encrypted = "VDXRRG"
    crack_caesar(encrypted)
