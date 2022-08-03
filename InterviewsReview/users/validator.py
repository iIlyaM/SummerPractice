from typing import Optional

from sqlalchemy.orm import Session

from .models import UserAuth


async def verify_email_exist(email: str, db_session: Session) -> Optional[UserAuth]:
    return db_session.query(UserAuth).filter(UserAuth.email == email).first()
