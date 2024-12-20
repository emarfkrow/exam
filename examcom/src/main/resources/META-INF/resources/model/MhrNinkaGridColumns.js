/**
 * 認可マスタグリッド定義
 */

let MhrNinkaGridColumns = [
    Column.refer('BUSHO_ID', Messages['MhrNinkaGrid.bushoId'], 80, 'primaryKey numbering', 'null'),
    Column.refer('SHOKUI_ID', Messages['MhrNinkaGrid.shokuiId'], 80, 'primaryKey numbering', 'null'),
    Column.refer('KINO_NM', Messages['MhrNinkaGrid.kinoNm'], 160, 'primaryKey', 'null'),
    Column.select('KENGEN_KB', Messages['MhrNinkaGrid.kengenKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    Column.date('KAISHI_BI', Messages['MhrNinkaGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrNinkaGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.check('DELETE_F', Messages['MhrNinkaGrid.deleteF'], 30, ''),
];
