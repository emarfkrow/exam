/**
 * ユーザマスタグリッド定義
 */

let MhrUserGridColumns = [
    Column.comma('USER_ID', Messages['MhrUserGrid.userId'], 80, 'primaryKey numbering', null),
    Column.text('USER_SEI', Messages['MhrUserGrid.userSei'], 300, 'notblank', null),
    Column.text('USER_MEI', Messages['MhrUserGrid.userMei'], 300, 'notblank', null),
    Column.text('E_MAIL', Messages['MhrUserGrid.eMail'], 300, 'notblank', null),
    Column.text('PASSWORD', Messages['MhrUserGrid.password'], 300, 'notblank', null),
    Column.date('KAISHI_BI', Messages['MhrUserGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrUserGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.check('DELETE_F', Messages['MhrUserGrid.deleteF'], 30, ''),
    Column.select('STATUS_KB', Messages['MhrUserGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
];
