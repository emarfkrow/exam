/**
 * 認可マスタグリッド定義
 */

let MhrNinkaGridColumns = [];

$(function() {
    MhrNinkaGridColumns = [
        Column.refer('BUSHO_ID', Messages['MhrNinkaGrid.bushoId'], 90, 'primaryKey', 'BUSHO_MEI'),
        Column.refer('SHOKUI_ID', Messages['MhrNinkaGrid.shokuiId'], 90, 'primaryKey', 'SHOKUI_MEI'),
        Column.text('KINO_NM', Messages['MhrNinkaGrid.kinoNm'], 180, 'primaryKey', null),
        Column.select('KENGEN_KB', Messages['MhrNinkaGrid.kengenKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.date('TEKIYO_BI', Messages['MhrNinkaGrid.tekiyoBi'], 90, '', Slick.Formatters.Extends.Date),
        Column.date('SHURYO_BI', Messages['MhrNinkaGrid.shuryoBi'], 90, '', Slick.Formatters.Extends.Date),
        Column.cell('UPDATE_TS', Messages['MhrNinkaGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
