/**
 * 認可マスタグリッド定義
 */

let MhrNinkaGridColumns = [
    Column.refer('BUSHO_ID', Messages['MhrNinkaGrid.bushoId'], 80, 'primaryKey numbering', 'null'),
    Column.refer('SHOKUI_ID', Messages['MhrNinkaGrid.shokuiId'], 80, 'primaryKey numbering', 'null'),
    Column.refer('KINO_NM', Messages['MhrNinkaGrid.kinoNm'], 240, 'primaryKey', 'null'),
    Column.select('KENGEN_KB', Messages['MhrNinkaGrid.kengenKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    Column.date('KAISHI_BI', Messages['MhrNinkaGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrNinkaGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.cell('INSERT_TS', Messages['MhrNinkaGrid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['MhrNinkaGrid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['MhrNinkaGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['MhrNinkaGrid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MhrNinkaGrid.deleteF'], 30, ''),
];
